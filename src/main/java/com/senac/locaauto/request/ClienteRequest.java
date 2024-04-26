package com.senac.locaauto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Integer enderecoId;
}
