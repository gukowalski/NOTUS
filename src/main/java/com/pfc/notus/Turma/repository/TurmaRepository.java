package com.pfc.notus.Turma.repository;


import com.pfc.notus.Turma.domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
