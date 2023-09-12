package DesenvolvimentoSistemas.Sorteador.Controller;

import DesenvolvimentoSistemas.Sorteador.Service.S_Sorteador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Sorteador {
    @GetMapping("/")
    public String getHome() {
        return "Home/home";
    }

    @PostMapping("/")
    public String calSorteador(@RequestParam("qtdeNumero") int qtdeNumero,
                               @RequestParam("iniNumero") int iniNumero,
                               @RequestParam("fimNumero") int fimNumero,
                               @RequestParam("crescente") boolean crescente,
                               @RequestParam("semRepeticao") boolean semRepeticao,
                               Model model) {

        S_Sorteador s_sorteador = new S_Sorteador(qtdeNumero, iniNumero, fimNumero, crescente, semRepeticao);

        return "Resultado/resultado";
    }
}