package com.firstit.api.embalagem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "embalagens")
@Entity(name = "Embalagem")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Embalagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Codigo codigo;
    private int quantidade;
    private Date entrada = new Date();

    public Embalagem(AdicionarEmbalagem embalagem){
        this.codigo = embalagem.codigo();
        this.quantidade = embalagem.quantidade();
    }

}
