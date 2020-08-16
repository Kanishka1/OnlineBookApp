$(document).ready(function () 
{  
    $("#btn").click(function () 
    { 
        var obj=[
            {id: $("#tourid").val(),
            hotel:{name: $("#hname").val(), address:{location:$("#hloc").val(),city:$("#hcity").val(),state:$("#hstate").val()}},
            touristplace:{name: $("#tpname").val(), description: $("#tpdesc").val(), address:{location:$("#tploc").val(),city:$("#tpcity").val(),state:$("#tpstate").val()}},
            event: {name: $("#ename").val(), description: $("#edesc").val(), date: $("#edate").val(), time: $("#etime").val(), address:{location:$("#eloc").val(),city:$("#ecity").val(),state:$("#estate").val()}}
            }];
        var st=JSON.stringify(obj);
        url="http://localhost:8080/tours";
    $.post(url,obj,function (data, status) 
    {  
        $("#test").html("DONE ").append(st);
       console.log(obj);
       console.log(data);

    })  
})
});