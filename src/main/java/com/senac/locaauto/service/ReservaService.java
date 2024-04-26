package com.senac.locaauto.service;

import java.util.List;

import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.ReservaRequest;
import com.senac.locaauto.response.ReservaResponse;

public interface ReservaService {

    List<ReservaResponse> listAll();

    ReservaResponse findById(IdRequest request);

    void delete(IdRequest request);

    ReservaResponse save(ReservaRequest request);
    
}
