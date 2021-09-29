package com.sep.senac.br.demo.controler;

import com.sep.senac.br.demo.DAO.RepositorioDAO;
import com.sep.senac.br.demo.model.RepositorioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RepositorioController {

    @GetMapping("/cadastro_repositorio")
    public ModelAndView paginaCadastroRepositorio(RepositorioEntity repositorio){
        ModelAndView mv = new ModelAndView("cadastro_repositorio");
        mv.addObject("repositorio", repositorio);
        return mv;
    }
    @Autowired
    private RepositorioDAO dao;
    @PostMapping("/salvarRepositorio")
    public String salvarRepostorio(@ModelAttribute RepositorioEntity repositorio){
        dao.save(repositorio);
        return "index";
    }


}
