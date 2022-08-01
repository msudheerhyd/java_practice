function drawHead(){
    ctx.strokeStyle="gray";
    ctx.beginPath();
    ctx.moveTo(B.x,B.y);
    ctx.quadraticCurveTo(A.x,A.y,C.x,C.y);
    ctx.moveTo(-0.45,-0.13);
    ctx.quadraticCurveTo(A.x,A.y,0.45,-0.13);
    ctx.stroke();


    ctx.beginPath();
    ctx.moveTo(B.x,B.y);
    ctx.quadraticCurveTo(-0.44,-0.71,-0.45,-0.13);
    ctx.quadraticCurveTo(-0.37,0.28,C.x,C.y);
    ctx.quadraticCurveTo(0.37,0.28,0.45,-0.13);
    ctx.quadraticCurveTo(0.44,-0.71,B.x,B.y);
    ctx.stroke();
    ctx.fillStyle=skinTone;
    ctx.fill();

    ctx.strokeStyle="black";
    drawEyes(A);
    drawBeard(A);
    drawHair(A);
    drawNose(A);
    drawEars(A);

}

function drawEars(ref){
    ctx.save();
    ctx.translate(ref.x,ref.y);
    
    drawEar(ref.xOffset,ref.yOffset);
    ctx.scale(-1,1);
    drawEar(-ref.xOffset,ref.yOffset);

    ctx.restore();
}

function drawEar(scaleX,scaleY){
    ctx.save();  

    const verticalSquish=1-Math.abs(scaleY*0.2)
    const horizontalSquish=1-scaleX*0.6     
    ctx.scale(horizontalSquish,verticalSquish);
    ctx.translate(scaleX*0.1,0);
    ctx.moveTo(0.41,0.1);
    ctx.quadraticCurveTo(0.40,-0.02,0.48,-0.02);
    ctx.quadraticCurveTo(0.49,0.06,0.40,0.25);
    ctx.quadraticCurveTo(0.37,0.28,0.37,0.23);
    ctx.closePath();
    ctx.fillStyle=skinTone;
    ctx.fill();
    ctx.stroke();

    ctx.restore();
}

function drawNose(ref){
    ctx.save();
    ctx.translate(ref.x,ref.y);

    ctx.beginPath();
    ctx.moveTo(0,0.2);

    const tip={
        x:ref.xOffset*0.2,
        y:0.29  
    }

    //TO-DO
    //2 control points
    //do something about the line
    ctx.quadraticCurveTo(tip.x,tip.y,0,0.33);
    ctx.stroke();

    ctx.restore();
}


function drawHair(ref){
    ctx.save();
    ctx.translate(ref.x,ref.y);

    drawHalfHair(
        Math.max(0,ref.xOffset),
        ref.yOffset,
        Math.min(0,ref.xOffset));
    
    ctx.scale(-1,1);

    drawHalfHair(
        Math.max(0,-ref.xOffset),  
        ref.yOffset, 
        Math.min(0,-ref.xOffset));
    
    ctx.restore();
}

function drawHalfHair(scaleX,verticalScaler,horizontalScaler){
    ctx.save(); 
    const horizontalSquish=1-scaleX*0.45
    ctx.scale(horizontalSquish,1);

    ctx.beginPath();
    ctx.moveTo(0.39,0.09);
    ctx.quadraticCurveTo(0.47,-0.44,0,-0.44);

    const topMostPoint={
        x:0,
        y:-0.65-verticalScaler*0.2,
    }

    ctx.lineTo(topMostPoint.x,topMostPoint.y);

    const rightMostPoint={
        x:0.46-horizontalScaler*0.2,
        y:0.09,
    }
    const controlPoint={
        x:0.6-horizontalScaler*0.2,
        y:-0.6-verticalScaler*0.2,
    }
    ctx.quadraticCurveTo(
        controlPoint.x,controlPoint.y,
        rightMostPoint.x,rightMostPoint.y);

    ctx.closePath();

    ctx.restore();
    ctx.fillStyle="black";
    ctx.fill();
}

function drawBeard(ref){
    ctx.save();
    ctx.translate(ref.x,ref.y);

    drawHalfBeard(
        Math.max(0,ref.xOffset),
        ref.yOffset,
        Math.min(0,ref.yOffset),
        Math.min(0,ref.xOffset));
    
    ctx.scale(-1,1);

    drawHalfBeard(
        Math.max(0,-ref.xOffset),
        ref.yOffset,
        Math.min(0,ref.yOffset),
        Math.min(0,-ref.xOffset));

    ctx.restore();
}

function drawHalfBeard(scaleX,scaleY,verticalScaler,horizontalScaler){
    ctx.save(); 

    const horizontalSquish=1-scaleX*0.45
    const verticalSquish=1-Math.abs(scaleY*0.2)
    ctx.scale(horizontalSquish,verticalSquish);

    ctx.beginPath();
    ctx.moveTo(0.39,0.09);
    ctx.quadraticCurveTo(0.31,0.28,0.17,0.36);
    ctx.quadraticCurveTo(0.09,0.33,0,0.35);


    ctx.lineTo(0.01,0.38);
    ctx.lineTo(0.11,0.42);
    ctx.lineTo(0.06,0.49);
    ctx.lineTo(0.04,0.46);
    ctx.lineTo(0,0.46);

    const bottomMostPoint={
        x:0,
        y:0.59-verticalScaler*0.3,
    }
    ctx.lineTo(bottomMostPoint.x,bottomMostPoint.y);
     
    const rightMostPoint={
        x:0.46-horizontalScaler*0.2,
        y:0.09,
    }

    const controlPoint={
        x:0.38-horizontalScaler*0.2,
        y:0.46-verticalScaler*0.3,
    }

    ctx.quadraticCurveTo(
        controlPoint.x,controlPoint.y,
        rightMostPoint.x,rightMostPoint.y);
    ctx.closePath();

    ctx.fillStyle="black";
    ctx.fill();

    ctx.restore();
 
}

function drawEyes(ref){
    ctx.save();

    ctx.translate(ref.x,ref.y);

    drawEye(Math.max(0,ref.xOffset),ref.yOffset);
    ctx.scale(-1,1);    
    drawEye(Math.max(0,-ref.xOffset),ref.yOffset);
    
    ctx.restore();
}

function drawEye(scaleX,scaleY){
    ctx.save();  
    const verticalSquish=1-Math.abs(scaleY*0.2)
    const horizontalSquish=1-scaleX*0.4
    ctx.scale(horizontalSquish,verticalSquish);

    // white part
    ctx.beginPath();
    ctx.moveTo(0.05,0.11);
    ctx.quadraticCurveTo(0.06,0.18,0.20,0.19);
    ctx.quadraticCurveTo(0.35,0.18,0.35,0.06);
    ctx.quadraticCurveTo(0.35,0.02,0.19,0.02);
    ctx.quadraticCurveTo(0.05,0.01,0.05,0.11);
    ctx.fillStyle="white";
    ctx.fill();

    // eye brow
    ctx.beginPath();
    ctx.fillStyle="black";
    ctx.moveTo(0.07,0.07);
    ctx.quadraticCurveTo(0.21,-0.01,0.33,0.08);
    ctx.quadraticCurveTo(0.39,0.10,0.36,0.04);
    ctx.quadraticCurveTo(0.19,-0.06,0.03,0.04);
    ctx.quadraticCurveTo(0.02,0.09,0.07,0.07);
    ctx.fill();

    // pupil
    ctx.beginPath();
    ctx.arc(0.17,0.09,0.065,0,Math.PI*2);
    ctx.fill();

    // half-contour line
    ctx.beginPath();
    ctx.moveTo(0.20,0.19);
    ctx.quadraticCurveTo(0.35,0.18,0.35,0.06);
    ctx.restore();

    ctx.stroke();
}