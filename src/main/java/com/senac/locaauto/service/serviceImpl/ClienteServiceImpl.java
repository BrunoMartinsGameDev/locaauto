package com.senac.locaauto.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senac.locaauto.request.ClienteRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.ClienteResponse;
import com.senac.locaauto.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Override
    public ClienteResponse save(ClienteRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<ClienteResponse> listAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAll'");
    }

    @Override
    public ClienteResponse findById(IdRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(IdRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
} 