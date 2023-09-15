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

    if(podeEnviar) {
        $.ajax({
            type: "POST",
            url: "/resultado",
            data: {
                qtdeNumero: qtdeNumero,
                iniNumero: iniNumero,
                fimNumero: fimNumero
            },
            success: function(data) {
                $("#mensagemErro").text("");
                if(data.sucesso) {
                    window.location.href = "/resultado";
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