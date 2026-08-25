package com.pfc.notus.Atividade.repository;


import com.pfc.notus.Atividade.domain.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

}
