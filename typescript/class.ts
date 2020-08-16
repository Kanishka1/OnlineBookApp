class Employee
{
    constructor(public name: string,public city:string,
        public age?:number){}
    
        greet(username: string):void
        {
            console.log('Welcome '+username);
        }
        details():void
        {
            console.log(`Welcome ${this.name} from ${this.city}`);
        }
        showMsg():string
        {
            return "Hello"
        }

}

var emp:Employee=new Employee("Kanishka", "Jabalpur");
emp.greet('Kanishka');
emp.details();
console.log(emp.showMsg());