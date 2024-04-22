package com.senac.locaauto.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.locaauto.mapper.EnderecoMapper;
import com.senac.locaauto.model.Endereco;
import com.senac.locaauto.repository.EnderecoRepository;
import com.senac.locaauto.request.EnderecoRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.EnderecoResponse;
import com.senac.locaauto.service.EnderecoService;

import jakarta.persistence.EntityNotFoundException;
@Service
public class EnderecoServiceImpl implements EnderecoService{
    @Autowired
    EnderecoMapper mapper;
    @Autowired
    EnderecoRepository repository;

    @Override
    public EnderecoResponse save(EnderecoRequest request) {
        if(request.getId() == null){
            Endereco entity = mapper.getEntityFromRequest(request);
            return mapper.getResponseFromEntity(repository.save(entity));
        }else{
            Optional<Endereco> entity = repository.findById(request.getId());
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
        Optional<Endereco> entity = repository.findById(request.getId());
            if(entity.isPresent()){
                repository.delete(entity.get());
            }
            else{
                throw new EntityNotFoundException();
            }
    }

    @Override
    public EnderecoResponse findById(IdRequest request) {
        Optional<Endereco> entity = repository.findById(request.getId());
        if(entity.isPresent()){
            return mapper.getResponseFromEntity(entity.get());
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<EnderecoResponse> listAll() {
        List<Endereco> entity = repository.findAll();
        if(!entity.isEmpty()){
            List<EnderecoResponse> response = new ArrayList<>();
            for (Endereco e : entity){
                response.add(mapper.getResponseFromEntity(e));
            }
            return response;
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    
} 