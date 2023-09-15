$("#btnSortear").click(validaEnvio){
    event.preventDefault();
    $.get("/", function(data) {
        $(".container").html(data);
    });
});