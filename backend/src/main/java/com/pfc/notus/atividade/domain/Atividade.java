package com.pfc.notus.atividade.domain;

import com.pfc.notus.disciplina.domain.Disciplina;
import com.pfc.notus.entrega.domain.Entrega;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_atividade")
@NoArgsConstructor
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String content;
    @Getter @Setter
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "disciplina_id", nullable = false)
    private Disciplina disciplina;

    @OneToMany (mappedBy = "atividade", cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter @Setter
    private List<Entrega> entregas = new ArrayList<>();

    public Atividade(String title, String content) {
        this.title = title;
        this.content = content;
        this.status = "Status";
    }
}