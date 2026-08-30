package com.pfc.notus.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_responsible")
@NoArgsConstructor
@AllArgsConstructor
public class Responsible {

    @Id
    private Long id;

    @OneToMany(mappedBy = "responsible")
    @MapsId
    private List<Student> student = new ArrayList<>();
}
