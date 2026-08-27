package com.pfc.notus.Matricula.repository;

import com.pfc.notus.entrega.domain.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface MatriculaRepository extends JpaRepository<Entrega, Long> {
}
