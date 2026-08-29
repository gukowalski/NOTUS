package com.pfc.notus.Entrega.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfc.notus.entrega.repository.EntregaRepository;

import java.util.List;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public List<Entrega> getAllEntrega() {return entregaRepository.findAll();}
}
