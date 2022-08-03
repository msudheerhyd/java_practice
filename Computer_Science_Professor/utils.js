function lerp(s,e,t){
    return s+(e-s)*t;
}

function drawPoint(loc,label,rad=0.07){
    ctx.beginPath();
    ctx.arc(loc.x,loc.y,rad,0,Math.PI*2);
    ctx.fillStyle="green";
    ctx.fill();  
    ctx.fillStyle="white";
    ctx.font=(rad*1.6)+"px Arial";
    ctx.textAlign="center";
    ctx.textBaseline="middle";          
    ctx.fillText(label,loc.x,loc.y+rad*0.15);
}

function getMarkedLocations(imgData,color=[0,0,255],threshold=160){
    const locs=[];
    const data=imgData.data;
    for(let i=0;i<=data.length;i+=4){
        const r=data[i];
        const g=data[i+1];
        const b=data[i+2];
        if(match([r,g,b],color,threshold)){
            const pIndex=i/4;
            const y=Math.floor(pIndex/imgData.width);
            const x=pIndex%imgData.width;
            locs.push({x,y});
        }
    }
    return locs;
}

function match(c1,c2,thr){
    return distance(c1,c2)<=thr;
}

function distance(p1,p2){
    let dist=0;
    for(let i=0;i<p1.length;i++){
        dist+=(p1[i]-p2[i])*(p1[i]-p2[i]);
    }
    return Math.sqrt(dist);
}

function average(locs){
    const avg={x:0,y:0};
    for(let i=0;i<locs.length;i++){
        avg.x+=locs[i].x;
        avg.y+=locs[i].y;
    }
    avg.x/=locs.length;
    avg.y/=locs.length;
    return avg; 
}