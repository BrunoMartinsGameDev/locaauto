package com.senac.locaauto.request;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservaRequest {
    private Long id;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private VeiculoRequest veiculo;
    private ClienteRequest cliente;
}
