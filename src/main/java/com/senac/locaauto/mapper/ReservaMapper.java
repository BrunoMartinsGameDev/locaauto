package com.senac.locaauto.mapper;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.senac.locaauto.model.Cliente;
import com.senac.locaauto.model.Reserva;
import com.senac.locaauto.model.Veiculo;
import com.senac.locaauto.repository.ClienteRepository;
import com.senac.locaauto.repository.VeiculoRepository;
import com.senac.locaauto.request.ReservaRequest;
import com.senac.locaauto.response.ReservaResponse;

import jakarta.persistence.EntityNotFoundException;
@Component
public class ReservaMapper {
    @Autowired
    VeiculoRepository veiculoRepository;
    @Autowired
    VeiculoMapper veiculoMapper;
    @Autowired
    ClienteRepository clienteRespository;
    @Autowired
    ClienteMapper clienteMapper;

    public Reserva getEntityFromRequest(ReservaRequest request) {

        Reserva entity = new Reserva();
        entity.setDatainicio(request.getDataInicio());
        entity.setDatafim(request.getDataFim());
        entity.setId(request.getId());
        if (request.getVeiculoId() != null) {
            Optional<Veiculo> veiculo = veiculoRepository.findById(request.getVeiculoId().longValue());
            if (veiculo.isPresent()) {
                entity.setVeiculo(veiculo.get());
            } else {
                throw new EntityNotFoundException();
            }
        }
        if (request.getClienteId() != null) {
            Optional<Cliente> cliente = clienteRespository.findById(request.getClienteId().longValue());
            if (cliente.isPresent()) {
                entity.setCliente(cliente.get());
            } else {
                throw new EntityNotFoundException();
            }
        }
        return entity;
    }

    public ReservaResponse getResponseFromEntity(Reserva entity) {

        ReservaResponse response = new ReservaResponse();
        response.setDataInicio(entity.getDatainicio());
        response.setDataFim(entity.getDatafim());
        response.setId(entity.getId());
        response.setVeiculo(veiculoMapper.getResponseFromEntity(entity.getVeiculo()));
        response.setCliente(clienteMapper.getResponseFromEntity(entity.getCliente()));
        return response;
    }
}
