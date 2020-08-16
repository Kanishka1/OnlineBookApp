var Rect = /** @class */ (function () {
    function Rect(x, y) {
        var _this = this;
        this.x = x;
        this.y = y;
        this.printArea = function () { return console.log(_this.x * _this.y); };
        this.showMessage = function (message) { return message; };
    }
    return Rect;
}());
var rectObj = new Rect(10, 20);
rectObj.printArea();
var createShape = function (shape) {
    console.log('Printing Area');
    shape.printArea();
};
createShape(rectObj);
var objlit = {
    x: 10, y: 20, printArea: function () { console.log("FROM OBJ LITERAL", this.x * this.y); },
    showMessage: function (message) { return message; }
};
createShape(objlit);
createShape({
    x: 10, y: 20, printArea: function () { console.log("FOR RECTANGLE", this.x * this.x); },
    showMessage: function (message) { return message; }
});
createShape({
    x: 10, y: 20, printArea: function () { console.log("FOR TRIANGLE", this.x * this.y * 0.5); },
    showMessage: function (message) { return message; }
});
