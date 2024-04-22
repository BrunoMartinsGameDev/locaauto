package com.senac.locaauto.mapper;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.senac.locaauto.model.Cliente;
import com.senac.locaauto.model.Endereco;
import com.senac.locaauto.repository.EnderecoRepository;
import com.senac.locaauto.request.ClienteRequest;
import com.senac.locaauto.response.ClienteResponse;

import jakarta.persistence.EntityNotFoundException;

public class ClienteMapper {
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    EnderecoMapper enderecoMapper;
    
    public Cliente getEntityFromRequest(ClienteRequest request) {

        Cliente entity = new Cliente();
        entity.setNome(request.getNome());
        entity.setEmail(request.getEmail());
        entity.setTelefone(request.getTelefone());
        entity.setCpf(request.getCpf());
        entity.setId(request.getId());
        if(request.getEnderecoId() != null) {
            Optional<Endereco> endereco = enderecoRepository.findById(request.getEnderecoId().longValue());
            if(endereco.isPresent()) {
                entity.setEndereco(endereco.get());
            }
            else{
                throw new EntityNotFoundException();
            }
        }
        return entity;
    }

    public ClienteResponse getResponseFromEntity(Cliente entity) {
        ClienteResponse response = new ClienteResponse();
        response.setNome(entity.getNome());
        response.setEmail(entity.getEmail());
        response.setTelefone(entity.getTelefone());
        response.setCpf(entity.getCpf());
        response.setId(entity.getId());
        response.setEndereco(enderecoMapper.getResponseFromEntity(entity.getEndereco()));
        return response;
    }
}
