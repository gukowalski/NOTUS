package com.pfc.notus.user.repository;

import com.pfc.notus.user.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposity extends JpaRepository<Student, Long> {
}
