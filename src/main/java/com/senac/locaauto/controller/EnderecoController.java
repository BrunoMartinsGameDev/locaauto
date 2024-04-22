package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.EnderecoRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.EnderecoResponse;
import com.senac.locaauto.service.EnderecoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/endereco")
@Tag(name = "Endereco")
@CrossOrigin("*")
public class EnderecoController {
    @Autowired
    EnderecoService service;

    @PostMapping("/save")
    public ResponseEntity<EnderecoResponse> save(@RequestBody EnderecoRequest request) {
        if(request.getId() != null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(request.getRua() == null || request.getBairro() == null
         || request.getCidade() == null || request.getEstado() == null
         || request.getCep() == null || request.getNumero() == null){
            return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
        }
        try{
            EnderecoResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/update")
    public ResponseEntity<EnderecoResponse> update(@RequestBody EnderecoRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            EnderecoResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/delete")
    public ResponseEntity<Void> delete(@RequestBody IdRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            service.delete(request);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/find-by-id")
    public ResponseEntity<EnderecoResponse> findById(@RequestBody IdRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            EnderecoResponse response = service.findById(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping("/list-all")
    public ResponseEntity<List<EnderecoResponse>> listAll() {
        try{
            List<EnderecoResponse> response = service.listAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
