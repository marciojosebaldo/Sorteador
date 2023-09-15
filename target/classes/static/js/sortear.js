//$("#btnSortear").click(function(event){
//    event.preventDefault();
//    $.get("/resultado", function(data) {
//        for(let i = 0; i < data.length; i++){
//            $(".container").append('<h1>'+data[i]+'<h1>');
//        }
//
//        history.pushState({}, '', "/resultado");
//    });
//});
$("#btnSortear").click(validaEnvio);