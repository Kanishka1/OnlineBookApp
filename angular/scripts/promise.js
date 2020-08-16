let comp= true  
var promise = new Promise(function(resolve,reject){  
if(comp){  
resolve('task completed')  
}else{  
reject('error occured');  
}  
})


let completed = true  
let task = new Promise((resolve,reject)=>{  
setTimeout(()=>{  
if(completed)  
resolve('Task completed')  
else{  
reject('task incomplete')  
}},5*1000);  
})  
task.then((success)=>console.log(success))  
.catch(error=>console.log(error))  