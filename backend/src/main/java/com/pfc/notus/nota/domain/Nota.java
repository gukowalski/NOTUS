package com.pfc.notus.nota.domain;

import com.pfc.notus.boletim.domain.Boletim;
import com.pfc.notus.entrega.domain.Entrega;
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
    private Long id;
    @Getter @Setter
    private String period;
    @Getter @Setter
    private Float rate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entrega_id", nullable = false, unique = true)
    private Entrega entrega;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boletim_id", nullable = false)
    private Boletim boletim;


    public Nota(Float rate, String period) {
        this.rate = rate;
        this.period = period;
    }
}
