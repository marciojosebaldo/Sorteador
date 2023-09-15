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
                               @RequestParam(value = "crescente", required = false) boolean crescente,
                               @RequestParam(value = "semRepeticao", required = false) boolean semRepeticao,
                               Model model) {

        model.addAttribute("resultado", S_Sorteador.Sorteador(qtdeNumero, iniNumero, fimNumero, crescente, semRepeticao));

        return "redirect:/";
    }

    @GetMapping("/resultado")
    public String getResultado() {
        return "Resultado/resultado";
    }



}