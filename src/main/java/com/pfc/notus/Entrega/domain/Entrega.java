package com.pfc.notus.entrega.domain;

import com.pfc.notus.atividade.domain.Atividade;
import com.pfc.notus.disciplina.domain.Disciplina;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_entrega")
@NoArgsConstructor
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter @Setter
    private String content;
    @Getter @Setter
    private String status;
    @Getter @Setter
    private LocalDateTime submissionDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "atividade_id", nullable = false)
    private Atividade atividade;

    public Entrega(String content, String status) {
        this.content = content;
        this.status = status;
        this.submissionDate = LocalDateTime.now() ;
    }
}
