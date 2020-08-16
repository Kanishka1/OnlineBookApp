var Employee = /** @class */ (function () {
    function Employee(name, city, age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    Employee.prototype.greet = function (username) {
        console.log('Welcome ' + username);
    };
    Employee.prototype.details = function () {
        console.log("Welcome " + this.name + " from " + this.city);
    };
    Employee.prototype.showMsg = function () {
        return "Hello";
    };
    return Employee;
}());
var emp = new Employee("Kanishka", "Jabalpur");
emp.greet('Kanishka');
emp.details();
console.log(emp.showMsg());
