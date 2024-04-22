package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.ClienteRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.ClienteResponse;
import com.senac.locaauto.service.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente")
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping("/save")
    public ResponseEntity<ClienteResponse> save(@RequestBody ClienteRequest request) {
        if(request.getId() != null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            ClienteResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/update")
    public ResponseEntity<ClienteResponse> update(@RequestBody ClienteRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            ClienteResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/delete")
    public ResponseEntity<ClienteResponse> delete(@RequestBody IdRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            service.delete(request);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/find-by-id")
    public ResponseEntity<ClienteResponse> findById(@RequestBody IdRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            ClienteResponse response = service.findById(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<ClienteResponse>> listAll() {
        try{
            List<ClienteResponse> response = service.listAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
