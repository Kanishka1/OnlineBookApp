/// <reference path= 'details.ts' />  
var NDetails;
(function (NDetails) {
    var Adder = /** @class */ (function () {
        function Adder() {
        }
        Adder.prototype.calculate = function (x, y) {
            console.log('Sum', x + y);
        };
        return Adder;
    }());
    NDetails.Adder = Adder;
    var Product = /** @class */ (function () {
        function Product() {
        }
        Product.prototype.calculate = function (x, y) {
            console.log('Prod', x * y);
        };
        return Product;
    }());
    NDetails.Product = Product;
})(NDetails || (NDetails = {}));
/// <reference path= 'Details.ts' />  
var Details;
(function (Details) {
    var Sub = /** @class */ (function () {
        function Sub() {
        }
        Sub.prototype.calculate = function (x, y) {
            console.log('Diff', x - y);
        };
        return Sub;
    }());
    Details.Sub = Sub;
})(Details || (Details = {}));
/// <reference path='Details.ts'/>  
/// <reference path='NDetails.ts'/>  
/// <reference path='Sub.ts'/>  
function performOpt(calculator, x, y) {
    calculator.calculate(x, y);
}
var addobj = new NDetails.Adder();
performOpt(addobj, 90, 80);
var prodobj = new NDetails.Product();
performOpt(prodobj, 90, 80);
var subobj = new Details.Sub();
performOpt(subobj, 90, 80);
