package com.senac.locaauto.service;

import java.util.List;

import com.senac.locaauto.request.ClienteRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.ClienteResponse;

public interface ClienteService {

    ClienteResponse save(ClienteRequest request);

    List<ClienteResponse> listAll();

    ClienteResponse findById(IdRequest request);

    void delete(IdRequest request);
    
}
