package com.sep.senac.br.demo.controler;

import com.sep.senac.br.demo.DAO.RepositorioDAO;
import com.sep.senac.br.demo.model.RepositorioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RepositorioController {

    @GetMapping("/cadastro_repositorio")
    public ModelAndView paginaCadastroRepositorio(RepositorioEntity repositorio){
        ModelAndView mv = new ModelAndView("cadastro_repositorio");
        mv.addObject("repositorios", repositorio);
        return mv;
    }
    @Autowired
    private RepositorioDAO dao;
    @PostMapping("/salvar_Repositorios")
    public String salvarRepostorio(@ModelAttribute RepositorioEntity repositorios){
        dao.save(repositorios);
        return "index";
    }

    @GetMapping("repositorios")
    public ModelAndView paginaRepositorios(){
        List<RepositorioEntity> listaRepositorios = dao.findAll();

        ModelAndView mv = new ModelAndView("repositorios");
        mv.addObject("repositorios", listaRepositorios);
        return mv;
    }


}
