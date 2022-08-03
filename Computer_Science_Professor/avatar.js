class Avatar{
    constructor(lookAt){
        this.eye=new Eye();
        this.beard=new Beard();
        this.hair=new Hair();
        this.lookAt=lookAt;
    }
    draw(ctx){
        ctx.save();
        ctx.translate(this.lookAt.xOffset*0.02,-0.06);
        ctx.scale(1-Math.abs(this.lookAt.xOffset)*0.04,1);
        this.#drawBody(ctx);
        ctx.restore();
        this.#drawHead(ctx);
        
        if(DEBUG){
            drawPoint(this.lookAt,"A");
        }
    }

    #drawBody(ctx){
        //skin part of the body
        ctx.beginPath();
        ctx.moveTo(-0.25+this.lookAt.xOffset*0.05,
            0.28+this.lookAt.yOffset*0.1);
        ctx.quadraticCurveTo(-0.21,0.41,-0.23,0.61);
        ctx.lineTo(-0.85,0.85);
        ctx.lineTo(-0.89,1.1);
        ctx.lineTo(+0.89,1.1);
        ctx.lineTo(+0.85,0.85);
        ctx.lineTo(+0.23,0.61);
        ctx.quadraticCurveTo(+0.21,0.41,
            +0.25+this.lookAt.xOffset*0.05,
            0.28+this.lookAt.yOffset*0.1);
        ctx.strokeStyle="black";
        ctx.fillstyle=skinTone;
        ctx.fill();
        ctx.stroke();

        // shirt part of the body
        ctx.fillStyle=shirtColor;
        ctx.beginPath();
        ctx.moveTo(0,0.88)
        ctx.lineTo(-0.41,0.65)
        ctx.lineTo(-0.84,0.81)
        ctx.quadraticCurveTo(-0.93,0.87,-0.95,1.1);
        ctx.lineTo(0.95,1.1)
        ctx.quadraticCurveTo(0.93,0.87,0.84,0.81);
        ctx.lineTo(0.41,0.65)
        ctx.closePath();
        ctx.fill();
        ctx.stroke();
    
    
        // neck part in shirt
        ctx.beginPath();
        ctx.moveTo(-0.41,0.71)
        ctx.quadraticCurveTo(-0.52,0.67,-0.47,0.61);
        ctx.quadraticCurveTo(-0.37,0.53,-0.18,0.73);
        ctx.quadraticCurveTo(-0.03,0.74,0.11,0.87);
        ctx.quadraticCurveTo(-0.13,0.92,-0.25,0.82);
        ctx.fill();
        ctx.stroke();
    
        // second neck part in shirt
        ctx.beginPath();
        ctx.moveTo(-0.17,0.87)
        ctx.quadraticCurveTo(-0.01,0.78,0.15,0.77);
        ctx.quadraticCurveTo(0.29,0.75,0.37,0.64);
        ctx.quadraticCurveTo(0.43,0.58,0.49,0.61);
        ctx.quadraticCurveTo(0.54,0.69,0.35,0.83);
        ctx.quadraticCurveTo(0.24,0.89,0.08,0.90);
        ctx.fill();
        ctx.stroke();
        ctx.beginPath();
        ctx.moveTo(0.08,0.89)
        ctx.quadraticCurveTo(-0.06,0.92,-0.17,0.87);
        ctx.fill();
    }

    #drawHead(ctx){
        ctx.strokeStyle="gray";
        ctx.beginPath();

        const B={x:0,y:-0.73};
        const verticalSquish=1-Math.abs(this.lookAt.yOffset*0.2);
        const C={
            x:this.lookAt.x,
            y:this.lookAt.y+(0.59-Math.min(0,this.lookAt.yOffset)*0.3)*verticalSquish,
        }

        ctx.moveTo(B.x,B.y);
        ctx.quadraticCurveTo(this.lookAt.x,this.lookAt.y,C.x,C.y);
        ctx.moveTo(-0.45,-0.13);
        ctx.quadraticCurveTo(this.lookAt.x,this.lookAt.y,0.45,-0.13);
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
        this.#drawEyes(this.lookAt,ctx);
        this.beard.draw(this.lookAt,ctx);
        this.hair.draw(this.lookAt,ctx);
        this.#drawNose(this.lookAt,ctx);
        this.#drawEars(this.lookAt,ctx);
    }
    
    #drawEars(ref,ctx){
        ctx.save();
        ctx.translate(ref.x,ref.y);
        
        this.#drawEar(ref.xOffset,ref.yOffset,ctx);
        ctx.scale(-1,1);
        this.#drawEar(-ref.xOffset,ref.yOffset,ctx);
    
        ctx.restore();
    }
    
    #drawEar(scaleX,scaleY,ctx){
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
    
    #drawNose(ref,ctx){
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
    
    #drawEyes(ref,ctx){
        ctx.save();
    
        ctx.translate(ref.x,ref.y);
    
        this.eye.draw(Math.max(0,ref.xOffset),ref.yOffset,ctx);
        ctx.scale(-1,1);    
        this.eye.draw(Math.max(0,-ref.xOffset),ref.yOffset,ctx);
        
        ctx.restore();
    }
}

