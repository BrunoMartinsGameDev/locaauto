package com.senac.locaauto.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.locaauto.mapper.VeiculoMapper;
import com.senac.locaauto.model.Veiculo;
import com.senac.locaauto.repository.VeiculoRepository;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.VeiculoRequest;
import com.senac.locaauto.response.VeiculoResponse;
import com.senac.locaauto.service.VeiculoService;

import jakarta.persistence.EntityNotFoundException;
@Service
public class VeiculoServiceImpl implements VeiculoService{

    @Autowired
    VeiculoMapper mapper;
    @Autowired
    VeiculoRepository repository;

    @Override
    public VeiculoResponse save(VeiculoRequest request) {
        if(request.getId() == null){
            Veiculo entity = mapper.getEntityFromRequest(request);
            Veiculo entityConstraint = repository.findByPlaca(entity.getPlaca());
            if(entityConstraint == null){
                return mapper.getResponseFromEntity(repository.save(entity));
            }
            else{
                throw new ConstraintViolationException(null, null, "placa");
            }
        }else{
            Optional<Veiculo> entity = repository.findById(request.getId());
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
        Optional<Veiculo> entity = repository.findById(request.getId());
            if(entity.isPresent()){
                repository.delete(entity.get());
            }
            else{
                throw new EntityNotFoundException();
            }
    }

    @Override
    public VeiculoResponse findById(IdRequest request) {
        Optional<Veiculo> entity = repository.findById(request.getId());
        if(entity.isPresent()){
            return mapper.getResponseFromEntity(entity.get());
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<VeiculoResponse> listAll() {
        List<Veiculo> entity = repository.findAll();
        if(!entity.isEmpty()){
            List<VeiculoResponse> response = new ArrayList<>();
            for (Veiculo e : entity){
                response.add(mapper.getResponseFromEntity(e));
            }
            return response;
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    
} 