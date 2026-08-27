package com.pfc.notus.boletim.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="tb_boletim")
@NoArgsConstructor
public class Boletim {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter @Setter
    private String period;
    @Getter @Setter
    private Float finalAverage;
    @Getter @Setter
    private String status;

    @OneToMany(mappedBy = "Boletim", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Nota> notas = new ArrayList<>();

    public Boletim(String period, Float finalAverage){
        this.period = period;
        this.finalAverage = finalAverage;
        this.status = "Status";
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getFinalAverage() {
        return finalAverage;
    }

    public void setFinalAverage(Float finalAverage) {
        this.finalAverage = finalAverage;
    }
}
