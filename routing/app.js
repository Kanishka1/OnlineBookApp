var app = angular.module('myapp',['ngRoute','myapp.bookapp'])  
app.config(['$routeProvider', function($routeProvider){  
$routeProvider  
.when("/home",{  
templateUrl:'bookapp/partials/home.html'  
})  
.when("/about",{  
template:'<strong>About us</strong>'  
})  
.when("/allbooks",{  
templateUrl:'bookapp/partials/allbooks.html',  
// controller:'bookCtrl'  
}) ;  
}]);