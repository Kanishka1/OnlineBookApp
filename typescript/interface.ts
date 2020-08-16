interface Empl
{  
    name:string;  
    city:string;  
    greet:()=>void;  
}  
class Managerr implements Empl{  
    constructor(public name:string,public city:string,){}  
    greet=()=>{  
    console.log('welcome')  
    }  
}  
var mgnr:Empl = new Managerr("Kanishka","Jabalpur");  
mgnr.greet();