$("btnSortear").on(click, function(event){
    event.preventDefault();
    $.get("/", function(data) {
        $(".container").html(data);
    });
});