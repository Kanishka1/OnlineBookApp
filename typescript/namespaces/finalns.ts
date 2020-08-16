/// <reference path='Details.ts'/>  
/// <reference path='NDetails.ts'/>  
/// <reference path='Sub.ts'/>  
function performOpt(calculator:Details.Calculator,x:number,y:number){  
    calculator.calculate(x,y);  
    }  
    let addobj:Details.Calculator = new NDetails.Adder();  
    performOpt(addobj,90,80);  
    let prodobj:Details.Calculator = new NDetails.Product();  
    performOpt(prodobj,90,80);  
    let subobj:Details.Calculator = new Details.Sub();  
    performOpt(subobj,90,80);  