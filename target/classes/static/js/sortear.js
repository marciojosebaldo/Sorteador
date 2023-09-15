$("#btnSortear").click(function(event){
    event.preventDefault();
    $.get("/resultado", function(data) {
        $(".container").html(data);
        $("#btnSortear").click(validaEnvio);
        history.pushState({}, '', "/"); // Pode manipular a URL em evento padrão
    });
});