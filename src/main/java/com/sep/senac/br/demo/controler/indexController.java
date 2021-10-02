package com.sep.senac.br.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String paginaInicial() { return "index";}

    @GetMapping("/sobre")
    public String paginaSobre() { return "sobre";}

    @GetMapping("/tabela_periodica")
    public  String paginaTabelaPeriodica(){
        return "tabela_periodica";
    }


}
