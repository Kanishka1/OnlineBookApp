class Person{  
    constructor(name,city){  
    this.city =city;  
    this.name = name;  
    }  
    get firstname(){  
    return this.name;  
    }  
    set firstname(name){  
    this.name = name;  
    }  
    set details(lname)
    {
        this. lname=(lname).toUpperCase();
    }
    }  
    var person = new Person('Raju');  
    // console.log(person.firstname);  
    // person.firstname='Marley';  
    // console.log(person.firstname);
     person.details="PERSON";
     console.log(person.details);