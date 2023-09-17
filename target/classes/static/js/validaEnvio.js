function validaEnvio() {
    let validador = true;
    let semRepeticao = $("#semRepeticao").prop("checked");
    let crescente = $("#crescente").prop("checked");
    let qtdeNumero = $("#qtdeNumero").val();
    let iniNumero = $("#iniNumero").val();
    let fimNumero = $("#fimNumero").val();

    $("#mensagemErro").text("");
    if (semRepeticao && ((fimNumero - iniNumero + 1) < qtdeNumero)) {
        $("#mensagemErro").append("A quantidade de números é menor do que o intervalo. Você pode permitir a repetição");
        validador = false;
        return;
    }

    if(validador) {
        $.ajax({
            type: "POST",
            url: "/resultado",
            data: {
                qtdeNumero: qtdeNumero,
                iniNumero: iniNumero,
                fimNumero: fimNumero,
                semRepeticao: semRepeticao,
                crescente: crescente
            },
            success: function(data) {
                $("#resultadoVetor").text(""); //Apaga o resultado retornado pelo Controller e não deixa acumular o resultado. Precisa incluir a div com classe resultado
                $("#resultadoQtde").text("");
                for(let i = 0; i < data.length; i++){
                    $("#resultadoVetor").append('<h1>'+data[i]+'<h1>'); // .container funcionava, mas os números se acumulavam
                }
                $("#resultadoQtde").append("Quantidade sorteada: " + data.length);
                dataHora();

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

function dataHora() {
    const d = new Date();
    $("#dataHora").text(d.toLocaleDateString() + ' ' + d.toLocaleTimeString() );
}

$("#btnSortear").click(validaEnvio);