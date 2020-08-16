var app=angular.module("my-app",[])

app.directive('greet',[function(){
    return{
        restrict:'EA',
        template:`
        <strong> Gave a Good Day</strong>
        <h1>Hey Kanishka </h1>
        `
    }
}])

app.controller('directCtrl',['$scope',function($scope)
{
$scope.products=['Mobile','TV'];  
$scope.flag=false;  
$scope.mymessage='Message from Controller';  
$scope.mydesc='Description from Controller';  
$scope.showItem=()=>{  
$scope.mymessage='See Item';  
$scope.flag=true;  
} 
}])

app.directive('strdirect',[function(){
    return{
        restrict:'EA',
        templateUrl:'direct.html',
        scope:
        {
            msg:'@msg',
            description:'@desc'
        }
    }
}])

app.directive('vardirect',[function(){
    return{
        restrict:'EA',
        templateUrl:'direct.html',
        scope:
        {
            msg:'=msg1',
            description:'=desc1',
            show:'&show' //event handling
        }
    }
}])