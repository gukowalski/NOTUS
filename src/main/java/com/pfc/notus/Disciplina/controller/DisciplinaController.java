package com.pfc.notus.disciplina.controller;

import com.pfc.notus.disciplina.domain.Disciplina;
import com.pfc.notus.disciplina.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/disciplina")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaService disciplinaService;
    
    @GetMapping
    public List<Disciplina> getAllDisciplina(){
        return disciplinaService.getAllDisciplina();
    }
    
    
}
