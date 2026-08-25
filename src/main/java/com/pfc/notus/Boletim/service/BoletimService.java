package com.pfc.notus.Boletim.service;


import com.pfc.notus.Boletim.domain.Boletim;
import com.pfc.notus.Boletim.repository.BoletimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletimService {

    @Autowired
    private BoletimRepository boletimrepository;

    public List<Boletim> getAllBoletim() { return boletimrepository.findAll();}
}
