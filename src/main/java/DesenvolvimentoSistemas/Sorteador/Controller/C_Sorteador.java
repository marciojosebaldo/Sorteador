package DesenvolvimentoSistemas.Sorteador.Controller;

import org.springframework.stereotype.Controller;
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
                               @RequestParam("fimNumero") int fimNumero) {

        return "x";

    }

}
