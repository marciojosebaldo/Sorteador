function validaEnvio() {
    let validador = true;
    let semRepeticao = $("#semRepeticao").val();
    let qtdeNumero = $("#qtdeNumero").val();
    let iniNumero = $("#iniNumero").val();
    let fimNumero = $("#fimNumero").val();

    if (((fimNumero - iniNumero) > qtdeNumero) && semRepeticao == true) {
        validador = false;
    }

}
function campoVazio() {
    if (campo == '') {
        return true;
    } else {
        return false;
    }
}