package DesenvolvimentoSistemas.Sorteador.Controller;

import DesenvolvimentoSistemas.Sorteador.Service.S_Sorteador;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Sorteador {

    @GetMapping("/")
    public String getHome() {
        return "Home/home";
    }

    @PostMapping("/resultado")
    @ResponseBody
    public ResponseEntity<?> calSorteador(@RequestParam("qtdeNumero") int qtdeNumero,
                                          @RequestParam("iniNumero") int iniNumero,
                                          @RequestParam("fimNumero") int fimNumero,
                                          @RequestParam(value = "crescente", required = false) boolean crescente,
                                          @RequestParam(value = "semRepeticao", required = false) boolean semRepeticao) {

        try {
            int[] resultado = S_Sorteador.Sorteador(qtdeNumero, iniNumero, fimNumero, crescente, semRepeticao);
            return ResponseEntity.ok(resultado);
        } catch (C_CondicaoNaoAtendida e) {
            String mensagemErro = e.getMessage();
            return ResponseEntity.badRequest().body(mensagemErro);
        }
    }
}