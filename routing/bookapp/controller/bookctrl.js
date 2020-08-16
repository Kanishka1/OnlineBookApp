angular.module('myapp.bookapp')
.controller('bookCtrl',['$scope','BookService',($scope,BookService)=>{
    var promise = BookService.getAllBooks();
    promise.then((result)=>{
        console.log(result.data);
        $scope.bookList = result.data 
    },(error)=>{
        console.log(error);
    })
}
]);