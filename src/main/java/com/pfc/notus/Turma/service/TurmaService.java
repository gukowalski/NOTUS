package com.pfc.notus.Turma.service;

import com.pfc.notus.Turma.domain.Turma;
import com.pfc.notus.Turma.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public List<Turma> findAllTurma() {return turmaRepository.findAll();}
}
