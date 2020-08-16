angular.module('myapp.bookapp')
.service('BookService',['$http',function($http){
    this.getAllBooks = function(){
        var promise = $http.get('http://localhost:8080/book-app/books');
        console.log(promise);
        return promise;
}
}]);