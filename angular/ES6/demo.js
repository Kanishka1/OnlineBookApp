// var sumfun =(arr)=>
// {  
//     let sum = 0;  
//     for(let i in arr)  
//     sum+=arr[i];  
//     console.log(sum);  
// }  
// sumfun([10,20,40]);  
//     //rest  
//     sumfun = (...args)=>
//     {  
//     let sum = 0;  
//     for(let i in args)  
//     sum+=args[i];  
//     console.log(sum);  
//     }  
//     sumfun();  
//     sumfun(10,20);  
//     sumfun(10,20,30);  
//     fun = function(a,b,...args){  
//     console.log("a",a);  
//     console.log("b",b);  
//     console.log(args);  
//     }  
//     fun(1,2,"hello",900);  
//     fun(1);  
//     fun(1,2);  
    
//     function sumNumbers(...args){  
//     return args.filter(n=>typeof n==='number')  
//     .reduce((previous,current)=>previous+current);  
//     }  
//     console.log(sumNumbers(30,null,40,undefined,60,'30abc'))  
//     console.log(sumNumbers(30,null,40,undefined,60,parseInt('30abc')))  

//     let newarr = [90,20,110,50,60];  
// console.log(Math.max(newarr));// returns NaN  
// console.log(Math.max(90,20,110,50,60));//110  
// //spreading the array  
// //turns the array into list of values  
// //spread operator  
// console.log(Math.max(...newarr));  
// let arr1 = [1, -2, 3, 4];  
// let arr2 = [8, 3, -8, 1];  
// console.log( Math.max(...arr1, ...arr2) );  
// //can be combined with other values  
// console.log( Math.max(10,...arr1,20, ...arr2) ); 

let sp= 'JavaScript';
console.log(...sp);

var str="Spring in Action";
let split=(str)=>
{
   count=0;
    sp.forEach((word)=>
    {
        if(word=='i')
        {
            count++;
        }
    })
    return count;
}
