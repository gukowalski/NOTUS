package com.pfc.notus.turma.domain;

import com.pfc.notus.atividade.domain.Atividade;
import com.pfc.notus.disciplina.domain.Disciplina;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_turma")
@NoArgsConstructor
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String schoolYear;

    @ManyToMany
    @JoinTable(
            name = "tb_turma_disciplina",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private Set<Disciplina> disciplinas = new HashSet<>();

    public Turma(String name,String schoolYear){
        this.name = name;
        this.schoolYear = schoolYear;
    }
}

