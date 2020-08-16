//Destructuring- breaking down a complex structure into simpler parts.  
arr = [1,2,3];  
var[a,b,c] = arr;  
console.log(a);  
var a,b = arr;  
console.log('s',b);  
var[a,,c] = arr;  
console.log(c);  
//object destructuring with same variable name  
const{username,city}={username:'Raju',city:'Bangalore'}  
console.log(username,city);  
//object destructuring with diff variable name  
const{username:myname,city:mycity}={username:'XYZ',city:'Jabalpur'}  
console.log(myname,mycity);  
var student={  
name:'Raju',city:'Chennai',hobby:['Sports','Music']  
}  
var details = ({name,city,hobby})=>{  
console.log(hobby)  
}  

var firstName = 'Kumaran'  
let greeting= `Hi ${firstName}`;  
console.log(greeting)  