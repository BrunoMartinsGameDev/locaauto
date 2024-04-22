package com.senac.locaauto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String placa;
    private String ano;
    private Boolean isAtivo;

    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reserva> reserva;
}
