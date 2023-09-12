package DesenvolvimentoSistemas.Sorteador.Controller;

import DesenvolvimentoSistemas.Sorteador.Service.S_Sorteador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Sorteador {

    private final S_Sorteador s_sorteador;

    public C_Sorteador(S_Sorteador s_sorteador) {
        this.s_sorteador = s_sorteador;
    }

    @GetMapping("/")
    public String getHome() {
        return "Home/home";
    }

    @PostMapping("/")
    public String calSorteador(@RequestParam("qtdeNumero") int qtdeNumero,
                               @RequestParam("iniNumero") int iniNumero,
                               @RequestParam("fimNumero") int fimNumero,
                               @RequestParam(value = "crescente", required = false) boolean crescente,
                               @RequestParam(value = "semRepeticao", required = false) boolean semRepeticao,
                               Model model) {

        s_sorteador.Sorteador(qtdeNumero, iniNumero, fimNumero, crescente, semRepeticao);

        // Testar no Accordion se o value true dispensa acima a colocagem do required

        return "Resultado/resultado";
    }
}