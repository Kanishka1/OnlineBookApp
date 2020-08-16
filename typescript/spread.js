// var myarr=[1,2,3,4];
// var new_arr=[...myarr,5,6,7];
// for(var i of new_arr)
// {
//     console.log(i);
// }
// var st={name:'Kanishka',age:20}
// var details={mobile:89898,city:"Bangalore"}
// var newStudent={...st,...details}
// var newemployee={...st,...details,sal:1000}
// console.log(newemployee);
// for( var j in newStudent)
// {
//     console.log(j,newStudent[j]);
// }
var printval = function (val) {
    var e = typeof (val);
    if (e == 'number') {
        console.log(val);
    }
    else if (e == 'object') {
        console.log(val);
    }
    else if (Array.isArray(e)) {
        var sum = 0;
        e.forEach(function (elem) { return sum + elem; });
        console.log(sum);
    }
};
printval({ name: "Kanishka" });
printval(10);
