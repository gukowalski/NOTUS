package com.pfc.notus.user.service;

import com.pfc.notus.user.domain.Responsible;
import com.pfc.notus.user.domain.Student;
import com.pfc.notus.user.domain.User;
import com.pfc.notus.user.dto.security.StudentInsertDTO;
import com.pfc.notus.user.repository.StudentReposity;
import com.pfc.notus.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentReposity studentReposity;

    public Student createStudent(StudentInsertDTO studentInsertDTO){
        var student = new Student();
        var responsible = new Responsible();
        User user = new User();

        return null;
    }
}
