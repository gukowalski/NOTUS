package com.pfc.notus.Disciplina.repository;


import com.pfc.notus.Disciplina.domain.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisiciplinaRepository extends JpaRepository<Disciplina, Long> {

}
