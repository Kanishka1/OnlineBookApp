function sayHello(name){  
    name = name!=undefined?name:'Rahul';  
    console.log('hello',name)  
    }  
    sayHello()  
    function welcome(name='priya'){  
    // console.log('welcome',name)  
    return(`welcome ${name}`)  
    // return('welcome '+name)  
    }  
    // welcome();  
    var sample = (greet=welcome())=>{  
    console.log(greet);  
    }  
    sample();  
    function sum(x,y=10){  
    console.log(x+y)  
    }  
    sum(4);  
    //parameters have own scope  
    total = function(x=10,y=x,z=x+y){  
    console.log(x+y+z);  
    }  
    total();  
    //parameters should be initialized first  
    // ntotal = function(x=y,y=1){  
    // console.log(x+y+z);  
    // }  
    // ntotal();  
    //parameters have own scope  
    total = function(x=1,y=2,z=3){  
    console.log(arguments.length);  
    console.log(x+y+z);  
    }  
    total(10);  
    total(10,20);  
    total(10,20,30);