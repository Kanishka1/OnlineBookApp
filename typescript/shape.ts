interface Shape{  
    x:number;y:number;  
    printArea:()=>void;  
    showMessage:(message:string)=>string;  
    }  
    class Rect implements Shape{  
    constructor(public x:number,public y:number){}  
    printArea=()=>console.log(this.x*this.y);  
    showMessage = (message:string)=>{return message}  
    }  
    var rectObj:Shape = new Rect(10,20);  
    rectObj.printArea();  

    var createShape=(shape:Shape)=>
    {
        console.log('Printing Area');
        shape.printArea();
    }
    createShape(rectObj);

    var objlit=
    {
        x:10,y:20,printArea:function(){console.log("FROM OBJ LITERAL",this.x*this.y)},
        showMessage:function(message:string){return message}
    }
    createShape(objlit);

    createShape(
        {
            x:10,y:20,printArea:function(){console.log("FOR RECTANGLE",this.x*this.x)},
            showMessage:function(message:string){return message}
        }
    )
    createShape(
        {
            x:10,y:20,printArea:function(){console.log("FOR TRIANGLE",this.x*this.y*0.5)},
            showMessage:function(message:string){return message}
        }
    )