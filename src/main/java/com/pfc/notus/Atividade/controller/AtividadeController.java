package com.pfc.notus.Atividade.controller;


import com.pfc.notus.Atividade.domain.Atividade;
import com.pfc.notus.Atividade.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/atividade")
public class AtividadeController {
    @Autowired
    private AtividadeService atividadeService;

    @GetMapping
    public List<Atividade> getAllAtividade(){return atividadeService.findAllAtividade();}
}
