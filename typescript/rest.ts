function addNumbers(...nums:number[]){  
    var sum = 0;  
    for(var i = 0;i<nums.length;i++){  
    sum+=nums[i];  
    }  
    console.log(sum);  
    }  
    addNumbers();  
    addNumbers(10,20,30);  
    addNumbers(10,20,30,40,50);  
    //default parameters  
    function userDetails(name:string,city:string='Bangalore'){  
    console.log('name '+name);  
    console.log('city '+city);  
    }  
    // userDetails();// must provide atleast one parameter  
    userDetails('Raju');  
    userDetails('Raju','Ooty');  