class Emp {       
    constructor(public name: string,public city:string){}
    print = ()=>{  
        console.log('welcome');  
        } 
    }   
 class Manager extends Emp {   
     
     constructor(public name:string,public city:string,public salary:number) {  
         super(name,city);  
         this.salary = salary;  
     }  
     print = ()=>
    {  
        console.log('welcome');  
    } 
    show(msg:string)
    {  
        console.log('Hello ',msg);  
    } 
 }
const employee: Emp = new Manager('Ram','Bangalore',1000);  
employee.print();  
console.log(employee instanceof Emp)  
console.log(employee instanceof Manager)  
const mgr: Manager = new Manager('Rohan','Bangalore',1000);  
mgr.print();  
mgr.show('Have a good day');   

