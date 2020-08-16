var app=angular.module("my-app",[])

app.controller('AddCtrl',['$scope','AddService',($scope,AddService)=>
{
    $scope.sumOfNumbers=()=>{  
        $scope.total= AddService.sum($scope.num1,$scope.num2);
        }
} 
]);

app.service('AddService',function()
{
    this.sum=(num1,num2)=>
    {
        return num1+num2;
    }
})
