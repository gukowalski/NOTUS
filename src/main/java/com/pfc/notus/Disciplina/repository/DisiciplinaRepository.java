package com.pfc.notus.Disciplina.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisiciplinaRepository extends JpaRepository<Disciplina, Long> {

}
