package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.VeiculoRequest;
import com.senac.locaauto.response.VeiculoResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/veiculo")
@Tag(name = "Veiculo")
@CrossOrigin("*")
public class VeiculoController {

    @PostMapping("/save")
    public ResponseEntity<VeiculoResponse> save(@RequestBody VeiculoRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/update")
    public ResponseEntity<VeiculoResponse> update(@RequestBody VeiculoRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/delete")
    public ResponseEntity<VeiculoResponse> delete(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/find-by-id")
    public ResponseEntity<VeiculoResponse> findById(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<VeiculoResponse>> listAll() {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    
}
