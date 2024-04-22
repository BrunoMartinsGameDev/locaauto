package com.senac.locaauto.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senac.locaauto.request.EnderecoRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.EnderecoResponse;
import com.senac.locaauto.service.EnderecoService;
@Service
public class EnderecoServiceImpl implements EnderecoService{

    @Override
    public EnderecoResponse save(EnderecoRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(IdRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public EnderecoResponse findById(IdRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<EnderecoResponse> listAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAll'");
    }

    
} 