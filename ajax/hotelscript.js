$(document).ready(function () {  
    $("#table").hide();
$("#btn").click(function () { 
    var uname= $("#uname").val();
  
    url="http://localhost:8080/hotel-by-name/"+uname;
$.get(url,function (data, status) 
{  
    
    console.log(data);
    var table = "<tr><td>" + data[0].hotel.name + "</td>";  
    table = table + "<td>" + data[0].hotel.address.location + "</td>";  
    table = table + "<td>" + data[0].hotel.address.city + "</td>";  
    table = table + "<td>" + data[0].hotel.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);

})  
})
$("#btn1").click(function () { 
   
    url="http://localhost:8080/tours";
 $.get(url,function (data, status) 
 {  
    
    console.log(data);
    for(var i=0;i<data.length;i++)
    {
    var table = "<tr><td>" + data[i].hotel.name + "</td>";  
    table = table + "<td>" + data[i].hotel.address.location + "</td>";  
    table = table + "<td>" + data[i].hotel.address.city + "</td>";  
    table = table + "<td>" + data[i].hotel.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);
    }
 })   
})
$("#btn2").click(function () { 
    var location= $("#location").val();
    url="http://localhost:8080/hotel-by-location/"+location;
 $.get(url,function (data, status) 
 {  
    
    console.log(data);
    for(var i=0;i<data.length;i++)
    {
    var table = "<tr><td>" + data[i].hotel.name + "</td>";  
    table = table + "<td>" + data[i].hotel.address.location + "</td>";  
    table = table + "<td>" + data[i].hotel.address.city + "</td>";  
    table = table + "<td>" + data[i].hotel.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);
    }
 })   
})
});