class HangingString{
    constructor(initLoc){
        this.initLoc=initLoc;
        this.particles=[
            new Particle([initLoc.x,initLoc.y],true),
            new Particle([initLoc.x,initLoc.y+0.3])
        ]
        this.segments=[
            new Segment(this.particles[0],this.particles[1])
        ]
    }
}


class Avatar{
    constructor(lookAt,shirtColor,skinTone){
        this.eye=new Eye();
        this.beard=new Beard();
        this.hair=new Hair();
        this.body=new Body(shirtColor,skinTone);
        this.lookAt=lookAt;

        this.leftString=new HangingString({x:-0.31,y:0.64});
        this.rightString=new HangingString({x:0.31,y:0.64});
    }

    draw(ctx){
        ctx.save();

        const xTranslate=this.lookAt.xOffset*0.02;
        const xScale=1-Math.abs(this.lookAt.xOffset)*0.04;
        ctx.translate(xTranslate,-0.07);
        ctx.scale(xScale,1);

        this.body.draw(this.lookAt,ctx);
        ctx.restore();
        this.#drawHead(ctx);

        this.leftString.particles[0].location=[
            this.leftString.initLoc.x+xTranslate*xScale,
            this.leftString.initLoc.y 
        ];
        Physics.updatePhysicsItems(this.leftString.particles);
        Physics.drawPhysicsItems(this.leftString.particles,ctx);

        Physics.updatePhysicsItems(this.leftString.segments);
        Physics.drawPhysicsItems(this.leftString.segments,ctx);

        if(DEBUG){
            drawPoint(this.lookAt,"A");
        }
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

