package com.senac.locaauto.mapper;

import com.senac.locaauto.model.Veiculo;
import com.senac.locaauto.request.VeiculoRequest;
import com.senac.locaauto.response.VeiculoResponse;

public class VeiculoMapper {

    public Veiculo getEntityFromRequest(VeiculoRequest request) {

        Veiculo entity = new Veiculo();
        entity.setModelo(request.getModelo());
        entity.setPlaca(request.getPlaca());
        entity.setAno(request.getAno());
        entity.setId(request.getId());
        return entity;

    }

    public VeiculoResponse getResponseFromEntity(Veiculo entity) {

        VeiculoResponse response = new VeiculoResponse();
        response.setModelo(entity.getModelo());
        response.setPlaca(entity.getPlaca());
        response.setAno(entity.getAno());
        response.setId(entity.getId());
        return response;
    }
}
