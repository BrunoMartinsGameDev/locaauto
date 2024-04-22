package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.EnderecoRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.EnderecoResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/endereco")
@Tag(name = "Endereco")
@CrossOrigin("*")
public class EnderecoController {

    @PostMapping("/save")
    public ResponseEntity<EnderecoResponse> save(@RequestBody EnderecoRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/update")
    public ResponseEntity<EnderecoResponse> update(@RequestBody EnderecoRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/delete")
    public ResponseEntity<EnderecoResponse> delete(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/find-by-id")
    public ResponseEntity<EnderecoResponse> findById(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<EnderecoResponse>> listAll() {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    
}
