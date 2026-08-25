package com.pfc.notus.Nota.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_nota")
@NoArgsConstructor
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;
    @Getter @Setter
    private String period;
    @Getter @Setter
    private Float value;

    public Nota(Float value, String period) {
        this.value = value;
        this.period = period;
    }
}
