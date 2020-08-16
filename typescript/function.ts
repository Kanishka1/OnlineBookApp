 //FUNCTION CONSTRUCTOR
function calcSumm (n1:number,n2:number):void {  
console.log(n1+n2);  
}  
calcSumm(10,20);  
 //FUNCTION EXPRESSION
var greetUsers = function (name: string){  
return 'welcome '+name;  
}  
console.log(greetUsers('Ram'));  
//LAMBDA EXPRESSION 
let greeters = (msg: string)=>{  
return msg;  
}  
console.log(greeters('Have a good day'));  