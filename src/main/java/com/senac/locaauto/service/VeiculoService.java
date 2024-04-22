package com.senac.locaauto.service;

import java.util.List;

import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.VeiculoRequest;
import com.senac.locaauto.response.VeiculoResponse;

public interface VeiculoService {

    List<VeiculoResponse> listAll();

    VeiculoResponse findById(IdRequest request);

    void delete(IdRequest request);

    VeiculoResponse save(VeiculoRequest request);
    
}
