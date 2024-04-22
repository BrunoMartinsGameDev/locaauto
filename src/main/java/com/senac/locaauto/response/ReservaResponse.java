package com.senac.locaauto.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservaResponse {
    private Long id;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private VeiculoResponse veiculo;
    private ClienteResponse cliente;

}
