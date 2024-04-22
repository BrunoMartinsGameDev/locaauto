package com.senac.locaauto.mapper;

import com.senac.locaauto.model.Endereco;
import com.senac.locaauto.request.EnderecoRequest;
import com.senac.locaauto.response.EnderecoResponse;

public class EnderecoMapper {

    public Endereco getEntityFromRequest(EnderecoRequest request) {
        Endereco entity = new Endereco();
        entity.setRua(request.getRua());
        entity.setBairro(request.getBairro());
        entity.setCidade(request.getCidade());
        entity.setCep(request.getCep());
        entity.setComplemento(request.getComplemento());
        entity.setEstado(request.getEstado());
        entity.setNumero(request.getNumero());
        entity.setId(request.getId());
        return entity;
    }

    public EnderecoResponse getResponseFromEntity(Endereco entity) {
        EnderecoResponse response = new EnderecoResponse();
        response.setRua(entity.getRua());
        response.setBairro(entity.getBairro());
        response.setCidade(entity.getCidade());
        response.setCep(entity.getCep());
        response.setComplemento(entity.getComplemento());
        response.setEstado(entity.getEstado());
        response.setNumero(entity.getNumero());
        response.setId(entity.getId());
        return response;
    }

}
