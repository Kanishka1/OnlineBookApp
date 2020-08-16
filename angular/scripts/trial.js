var app=angular.module("my-app",[]);


greetController= app.controller('greetCtrl',['$scope',function($scope)
{
    $scope.msg=("HELLOAAAA");
    $scope.msg1=("HELLO");
    $scope.person={name:'Kanishka',city:'Jabalpur'}
    $scope.myfontwt = 'bold';  
    $scope.mycolor ='green'; 
    $scope.spacing='2px'; 
    $scope.greet=function(username)
    {
        $scope.msg="Have a Great Day "+username;
       
    }
    $scope.sayHello=function()
    {
        $scope.user={
            firstname:$scope.fname,
            lastname:$scope.lname
        }
    }
    $scope.cstyle={
        backgroundColor:'red',color:'pink'
    }
    
}]);

childController= app.controller('childCtrl',['$scope','$filter',function($scope,$filter)
{
    $scope.title=$filter('uppercase')("Hello from child controller")
}]);

empController= app.controller('empCtrl',['$scope',function($scope)
{
    $scope.employee=[
        {name:'Kanishka',city:'Jabalpur',age:21,dept:'CSE',sal:12000},
        {name:'Prashi',city:'Bangalore',age:22,dept:'IT',sal:15000},
        {name:'ABC',city:'Indore',age:20,dept:'EC',sal:17000}]
}]);

productController=app.controller('productCtrl',['$scope',function($scope)
{
    $scope.itemList=[
        {
            name:"Laptop",
            quantity:3,
            price:40000
        },
        {
            name:"Mobile",
            quantity:2,
            price:15000
        },
        {
            name:"TV",
            quantity:4,
            price:30000
        },
    ];
    $scope.estyle={
        backgroundColor:'red',color:'pink'
    }
    $scope.ostyle={
        backgroundColor:'blue',color:'white'
    }
}]);

app.filter('myfilter',[function()
    {
        return function(input)
        {
            return "**"+input+"**";
        }
    }])
app.filter('nameWithA',[function()
    {
        return function(input,choice)
        {
            if(input.includes(choice))
            {
                return (input.toUpperCase());
            }
            else
            {
                return "NotFound";
            }
        }
    }])

