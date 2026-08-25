package com.pfc.notus.Boletim.repository;


import com.pfc.notus.Boletim.domain.Boletim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletimRepository extends JpaRepository<Boletim, Long> {

}
