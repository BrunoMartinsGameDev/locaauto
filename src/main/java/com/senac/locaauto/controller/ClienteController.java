package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.ClienteRequest;
import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.response.ClienteResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente")
@CrossOrigin("*")
public class ClienteController {

    @PostMapping("/save")
    public ResponseEntity<ClienteResponse> save(@RequestBody ClienteRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/update")
    public ResponseEntity<ClienteResponse> update(@RequestBody ClienteRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/delete")
    public ResponseEntity<ClienteResponse> delete(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/find-by-id")
    public ResponseEntity<ClienteResponse> findById(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<ClienteResponse>> listAll() {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    
}
