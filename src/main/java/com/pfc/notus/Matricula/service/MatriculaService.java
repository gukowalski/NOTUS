package com.pfc.notus.Matricula.service;


import com.pfc.notus.Matricula.domain.Matricula;
import com.pfc.notus.Matricula.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public List<Matricula> findAllMatricula(){return matriculaRepository.findAll();}
}
