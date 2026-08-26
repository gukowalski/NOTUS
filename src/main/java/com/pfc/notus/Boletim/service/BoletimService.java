package com.pfc.notus.boletim.service;


import com.pfc.notus.boletim.domain.Boletim;
import com.pfc.notus.boletim.dto.BoletimDTO;
import com.pfc.notus.boletim.repository.BoletimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletimService {

    @Autowired
    private BoletimRepository boletimrepository;

    public List<Boletim> getAllBoletim() {
       return boletimrepository.findAll();

    }

}
