package com.pfc.notus.Disciplina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisiciplinaRepository disciplinaRepository;

    public List<Disciplina> findAllDisciplina() {
        return disciplinaRepository.findAll();
    }
}