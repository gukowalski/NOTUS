package com.pfc.notus.Entrega.domain;

import com.pfc.notus.Disciplina.domain.Disciplina;
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


    public Entrega(String content, String status) {
        this.content = content;
        this.status = status;
        this.submissionDate = LocalDateTime.now() ;
    }
}
