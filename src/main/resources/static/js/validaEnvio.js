function validaEnvio() { {}
    let validador = true;
    let semRepeticao = $("#semRepeticao").val();
    let qtdeNumero = $("#qtdeNumero").val();
    let iniNumero = $("#iniNumero").val();
    let fimNumero = $("#fimNumero").val();

    $("#mensagemErro").text("");
    if (((fimNumero - iniNumero) > qtdeNumero) && semRepeticao == true) {
        validador = false;
        mensagem: "Oops! A quantidade de números é menor do que o intervalo. Você pode permitir a repetição"
    }

    if(validador) {
        $.ajax({
            type: "POST",
            url: "/resultado",
            data: {
                qtdeNumero: qtdeNumero,
                iniNumero: iniNumero,
                fimNumero: fimNumero
            },
            success: function(data) {
                $("#resultado").text(""); //Apaga o resultado retornado pelo Controller e não deixa acumular o resultado. Precisa incluir a div com classe resultado
                for(let i = 0; i < data.length; i++){
                    $("#resultado").append('<h1>'+data[i]+'<h1>'); // .container funcionava, mas os números se acumulavam
                }
            },
            error: function() {
                $('#mensagemErro').append("Falha na comunicação com o servidor");
            }
            }
        )};
    }

function campoVazio() {
    if (campo == '') {
        return true;
    } else {
        return false;
    }
}