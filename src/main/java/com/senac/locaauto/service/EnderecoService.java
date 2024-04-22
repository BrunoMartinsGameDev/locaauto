package com.senac.locaauto.service;

import java.util.List;

import com.senac.locaauto.request.EnderecoRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.EnderecoResponse;

public interface EnderecoService {

    EnderecoResponse save(EnderecoRequest request);

    void delete(IdRequest request);

    EnderecoResponse findById(IdRequest request);

    List<EnderecoResponse> listAll();
    
}
