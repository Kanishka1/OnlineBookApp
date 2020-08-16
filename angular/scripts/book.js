var app=angular.module("my-app",[])

app.controller('bookCtrl',['$scope','BookService',($scope,BookService)=>
{
    var promise=BookService.getAllBooks();
    promise.then((response)=>
    {
        console.log(response.data);
        $scope.bookList=response.data;
    },(error)=>{
        console.log(error);
    })
}
]);

app.service('BookService',['$http', function($http)
{
    this.getAllBooks=function()
    {
        var promise=$http.get('http://localhost:8080/book-app/books');
        return promise;
    }
}]);
