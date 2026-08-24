package com.pfc.notus.Disciplina.controller;

import com.pfc.notus.Disciplina.domain.Disciplina;
import com.pfc.notus.Disciplina.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/disciplina")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaService disiciplinaService;
    
    @GetMapping
    public List<Disciplina> getAllDisciplina(){
        return disiciplinaService.findAllDisciplina();
    }
    
    
}
