package com.pfc.notus.Turma.controller;


import com.pfc.notus.Turma.domain.Turma;
import com.pfc.notus.Turma.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> getAllTurmas() {return turmaService.findAllTurma();}

}
