$(document).ready(function () {  
    $("#table").hide();
$("#btn").click(function () { 
    var uname= $("#uname").val();
    url="http://localhost:8080/tourist-place-by-name/"+uname;
$.get(url,function (data, status) 
{  
    
    console.log(data);
    var table = "<tr><td>" + data[0].touristplace.name + "</td>";  
    table = table + "<td>" +  data[0].touristplace.description+ "</td>";  
    table = table + "<td>" + data[0].touristplace.address.location + "</td>";  
    table = table + "<td>" + data[0].touristplace.address.city + "</td>";  
    table = table + "<td>" + data[0].touristplace.address.state + "</td></tr>";  
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
    var table = "<tr><td>" + data[i].touristplace.name + "</td>";  
    table = table + "<td>" +  data[i].touristplace.description+ "</td>";  
    table = table + "<td>" + data[i].touristplace.address.location + "</td>";  
    table = table + "<td>" + data[i].touristplace.address.city + "</td>";  
    table = table + "<td>" + data[i].touristplace.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);
    }
 })   
})
$("#btn2").click(function () { 
    var uname= $("#location").val();
  
    url="http://localhost:8080/tourist-place-by-location/"+uname;
$.get(url,function (data, status) 
{  
    
    console.log(data);
    var table = "<tr><td>" + data[0].touristplace.name + "</td>";  
    table = table + "<td>" +  data[0].touristplace.description+ "</td>";  
    table = table + "<td>" + data[0].touristplace.address.location + "</td>";  
    table = table + "<td>" + data[0].touristplace.address.city + "</td>";  
    table = table + "<td>" + data[0].touristplace.address.state + "</td></tr>";  
    $("#table").show();
     $("#table").append(table);

})  
})
});