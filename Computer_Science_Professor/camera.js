const camCanvas=document.getElementById("camCanvas");
let video=null;
navigator.mediaDevices.getUserMedia({video:true})
    .then(function(data){
        video=document.createElement("video");
        video.srcObject=data;
        video.play();
        video.onloadeddata=function(){
            camCanvas.width=video.videoWidth;
            camCanvas.height=video.videoHeight;
        }
    }).catch(function(err){
        console.log(err);
    });

let constelationPoints={}
function processImage(){
    camCtx.drawImage(video,0,0);
    const imgData=camCtx.getImageData(0,0,camCanvas.width,camCanvas.height);
    const locs=getMarkedLocations(imgData);

    if(DEBUG){
        for(let i=0;i<locs.length;i++){
            camCtx.beginPath();
            camCtx.fillStyle="red";
            camCtx.rect(...locs[i],1,1);
            camCtx.fill();
        }
    }
    if(locs.length>0){
        const {nose,chest}=getConstelation(locs);
        constelationPoints.nose=nose;
        constelationPoints.chest=chest;

        drawPoint(camCtx,{x:nose[0],y:nose[1]},"N",20);
        drawPoint(camCtx,{x:chest[0],y:chest[1]},"C",20);

        if(constelationPoints.ref){
            const d1=distance(nose,chest);
            const d2=distance(constelationPoints.ref.nose,constelationPoints.ref.chest);

            /*
            const avg=average(locs); 
            const x=(avg[0]-imgData.width/2)/imgData.width;
            const y=(avg[1]-imgData.height/2)/imgData.height;
            */

            const diffY=5*(d2-d1)/imgData.height;
            const diffX=2*(nose[0]-chest[0])/d1;

            updateLookAt({value:diffX},'x');
            updateLookAt({value:diffY},'y');
        }
    }
}

function getConstelation(locs){
    const chestPoint=locs.find(p=>p[1]==Math.max(...locs.map(l=>l[1])));

    let nosePoint=locs[0];
    let maxDist=0;
    for(let i=0;i<locs.length;i++){
        const dist=distance(locs[i],chestPoint);
        if(dist>maxDist){
            maxDist=dist;
            nosePoint=locs[i];
        }
    }
    return {
        nose:nosePoint,
        chest:chestPoint
    };
}

function calibrate(){
    constelationPoints.ref={
        nose:constelationPoints.nose,
        chest:constelationPoints.chest,
    }
}