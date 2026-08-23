package com.pfc.notus;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_disciplina")
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String schoolYear;


}
