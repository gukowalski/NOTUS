package com.pfc.notus.Boletim.service;


import com.pfc.notus.Boletim.domain.Boletim;
import com.pfc.notus.Boletim.dto.BoletimDTO;
import com.pfc.notus.Boletim.repository.BoletimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletimService {

    @Autowired
    private BoletimRepository boletimrepository;

    public List<BoletimDTO> getAllBoletim() {
        return boletimrepository.findAll();

    }
        private BoletimDTO getBoletimDTO (Boletim boletim){
            return new BoletimDTO(boletim.getPeriod(), boletim.getFinalAverage(), boletim.getStatus());
        }
}
