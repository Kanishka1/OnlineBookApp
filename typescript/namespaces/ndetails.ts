/// <reference path= 'details.ts' />  
namespace NDetails{  
    export class Adder implements Details.Calculator{  
    public calculate(x,y){  
    console.log('Sum',x+y);  
    }  
    }  
    export class Product implements Details.Calculator{  
    public calculate(x,y){  
    console.log('Prod',x*y);  
    }  
    }  
    }  