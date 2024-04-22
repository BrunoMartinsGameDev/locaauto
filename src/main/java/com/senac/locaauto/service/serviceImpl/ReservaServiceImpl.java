package com.senac.locaauto.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.locaauto.mapper.ReservaMapper;
import com.senac.locaauto.model.Reserva;
import com.senac.locaauto.repository.ReservaRepository;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.ReservaRequest;
import com.senac.locaauto.response.ReservaResponse;
import com.senac.locaauto.service.ReservaService;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    ReservaMapper mapper;
    @Autowired
    ReservaRepository repository;

    @Override
    public ReservaResponse save(ReservaRequest request) {
        if(request.getId() == null){
            Reserva entity = mapper.getEntityFromRequest(request);
            return mapper.getResponseFromEntity(repository.save(entity));
        }else{
            Optional<Reserva> entity = repository.findById(request.getId());
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
        Optional<Reserva> entity = repository.findById(request.getId());
            if(entity.isPresent()){
                repository.delete(entity.get());
            }
            else{
                throw new EntityNotFoundException();
            }
    }

    @Override
    public ReservaResponse findById(IdRequest request) {
        Optional<Reserva> entity = repository.findById(request.getId());
        if(entity.isPresent()){
            return mapper.getResponseFromEntity(entity.get());
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<ReservaResponse> listAll() {
        List<Reserva> entity = repository.findAll();
        if(!entity.isEmpty()){
            List<ReservaResponse> response = new ArrayList<>();
            for (Reserva e : entity){
                response.add(mapper.getResponseFromEntity(e));
            }
            return response;
        }
        else{
            throw new EntityNotFoundException();
        }
    }
    

    
} 