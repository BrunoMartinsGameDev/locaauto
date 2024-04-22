package com.senac.locaauto.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.locaauto.mapper.ClienteMapper;
import com.senac.locaauto.model.Cliente;
import com.senac.locaauto.repository.ClienteRepository;
import com.senac.locaauto.request.ClienteRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.ClienteResponse;
import com.senac.locaauto.service.ClienteService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    ClienteMapper mapper;
    @Autowired
    ClienteRepository repository;

    @Override
    public ClienteResponse save(ClienteRequest request) {
        if(request.getId() == null){
            Cliente entity = mapper.getEntityFromRequest(request);
            return mapper.getResponseFromEntity(repository.save(entity));
        }else{
            Optional<Cliente> entity = repository.findById(request.getId());
            if(entity.isPresent()){
                return mapper.getResponseFromEntity(repository.save(mapper.getEntityFromRequest(request)));
            }
            else{
                throw new EntityNotFoundException();
            }
        }
    }

    @Override
    public void delete(IdRequest request) {
        Optional<Cliente> entity = repository.findById(request.getId());
            if(entity.isPresent()){
                repository.delete(entity.get());
            }
            else{
                throw new EntityNotFoundException();
            }
    }

    @Override
    public ClienteResponse findById(IdRequest request) {
        Optional<Cliente> entity = repository.findById(request.getId());
        if(entity.isPresent()){
            return mapper.getResponseFromEntity(entity.get());
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<ClienteResponse> listAll() {
        List<Cliente> entity = repository.findAll();
        if(!entity.isEmpty()){
            List<ClienteResponse> response = new ArrayList<>();
            for (Cliente e : entity){
                response.add(mapper.getResponseFromEntity(e));
            }
            return response;
        }
        else{
            throw new EntityNotFoundException();
        }
    }
    
} 