package com.pfc.notus.Atividade.service;


import com.pfc.notus.Atividade.domain.Atividade;
import com.pfc.notus.Atividade.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {

       @Autowired
    private AtividadeRepository atividadeRepository;

       public List<Atividade> findAllAtividade(){return atividadeRepository.findAll();}
}
