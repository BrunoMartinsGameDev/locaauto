package com.senac.locaauto.response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeiculoResponse {
    private Long id;
    private String modelo;
    private String placa;
    private String ano;
}
