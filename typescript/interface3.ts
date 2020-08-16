//union types  
interface Mobile 
{  
    charging: ()=>void;  
    call: ()=>void;  
}  
interface Laptop 
{  
    charging: ()=>void;  
    work: ()=>void;  
}  
function gadgetDetails(): Mobile | Laptop 
{  
    console.log('gadgets');  
    return ({  
    charging: ()=>{},  
    call: ()=>{console.log("call Called")},  
    });  
}  
    let newgadget = gadgetDetails();  
    newgadget.charging(); // same method can be called  
   // newgadget.call(); // not visible, throws error  