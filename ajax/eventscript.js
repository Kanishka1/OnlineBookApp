$(document).ready(function () {  
    $("#table").hide();
$("#btn").click(function () { 
    var uname= $("#uname").val();
  
    url="http://localhost:8080/event-by-name/"+uname;
$.get(url,function (data, status) 
{  
    
    console.log(data);
    var table = "<tr><td>" + data[0].event.name + "</td>";  
    table = table + "<td>" +  data[0].event.description+ "</td>";
    table = table + "<td>" + data[0].event.date + "</td>";
    table = table + "<td>" + data[0].event.time + "</td>";  
    table = table + "<td>" + data[0].event.address.location + "</td>";  
    table = table + "<td>" + data[0].event.address.city + "</td>";  
    table = table + "<td>" + data[0].event.address.state + "</td></tr>";  
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
   var table = "<tr><td>" + data[i].event.name + "</td>";  
   table = table + "<td>" +  data[i].event.description+ "</td>";  
   table = table + "<td>" +  data[i].event.date+ "</td>";  
   table = table + "<td>" +  data[i].event.time+ "</td>";  
   table = table + "<td>" + data[i].event.address.location + "</td>";  
   table = table + "<td>" + data[i].event.address.city + "</td>";  
   table = table + "<td>" + data[i].event.address.state + "</td></tr>";  
   $("#table").show();
    $("#table").append(table);
   }
})  
});

$("#btn2").click(function () { 
    var uname= $("#location").val();
  
    url="http://localhost:8080/event-by-location/"+uname;
$.get(url,function (data, status) 
{  
    
    console.log(data);
    var table = "<tr><td>" + data[0].event.name + "</td>";  
    table = table + "<td>" +  data[0].event.description+ "</td>";
    table = table + "<td>" + data[0].event.date + "</td>";
    table = table + "<td>" + data[0].event.time + "</td>";  
    table = table + "<td>" + data[0].event.address.location + "</td>";  
    table = table + "<td>" + data[0].event.address.city + "</td>";  
    table = table + "<td>" + data[0].event.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);

}) 
})  

$("#btn3").click(function () { 
    var uname= $("#date").val();
  
    url="http://localhost:8080/event-by-date/"+uname;
$.get(url,function (data, status) 
{  
    
    console.log(data);
    var table = "<tr><td>" + data[0].event.name + "</td>";  
    table = table + "<td>" +  data[0].event.description+ "</td>";
    table = table + "<td>" + data[0].event.date + "</td>";
    table = table + "<td>" + data[0].event.time + "</td>";  
    table = table + "<td>" + data[0].event.address.location + "</td>";  
    table = table + "<td>" + data[0].event.address.city + "</td>";  
    table = table + "<td>" + data[0].event.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);

})  
})  

})