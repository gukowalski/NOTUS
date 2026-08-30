package com.pfc.notus.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "tb_role")
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter @Setter
    private String authority;

    @Override
    public String getAuthority() {
        return authority;
    }
}
