package com.senac.locaauto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String rua;

    @Column
    private String numero;

    @Column
    private String estado;

    @Column
    private String bairro;

    @Column
    private String complemento;

    @Column
    private String cep;

    @Column
    private String cidade;

    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Cliente cliente;
}
