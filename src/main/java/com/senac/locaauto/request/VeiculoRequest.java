package com.senac.locaauto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeiculoRequest {
    private Long id;
    private String modelo;
    private String placa;
    private String ano;
}
