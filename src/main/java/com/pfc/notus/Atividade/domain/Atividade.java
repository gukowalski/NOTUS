package com.pfc.notus.Atividade.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    public Atividade(String title, String content) {
        this.title = title;
        this.content = content;
        this.status = "Status";
    }
}