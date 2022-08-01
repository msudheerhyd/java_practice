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