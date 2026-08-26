package com.pfc.notus.Boletim.controller;


import com.pfc.notus.Boletim.domain.Boletim;
import com.pfc.notus.Boletim.service.BoletimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/boletim")
public class BoletimController {

    @Autowired
    private BoletimService boletimService;

    @GetMapping
    public List<BoletimDTO> getAllBoletim(){return boletimService.getAllBoletim();}

    private boletimToDto
}
