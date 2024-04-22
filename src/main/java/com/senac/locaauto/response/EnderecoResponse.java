package com.senac.locaauto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoResponse {
    private Long id;
    private String rua;
    private String numero;
    private String estado;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;    
}
