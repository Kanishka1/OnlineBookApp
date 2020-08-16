//interface extending interfaces  
interface Calculator{  
    add: (x:number,y:number)=>void;  
    sub: (x:number,y:number)=>void;  
    }  
interface SciCalculator extends Calculator{  
    square: (x:number)=>void;       
    }  

class Calc implements SciCalculator
{  
    add = (x:number,y:number)=>{  
    console.log(x+y);  
    }  
    sub = (x:number,y:number)=>{  
    console.log(x-y);  
    }  
    square = (x:number)=>{  
    console.log(x*x);  
    }  
}  
function performOperation(calc:SciCalculator,x:number,y:number){  
    calc.square(x);  
    calc.add(x,y);  
    }  
    performOperation(new Calc(),20,30);