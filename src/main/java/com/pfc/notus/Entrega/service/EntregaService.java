package com.pfc.notus.Entrega.service;


import com.pfc.notus.entrega.domain.Entrega;
import com.pfc.notus.entrega.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public List<Entrega> getAllEntrega() {return entregaRepository.findAll();}
}
