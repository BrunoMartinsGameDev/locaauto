package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.VeiculoRequest;
import com.senac.locaauto.response.VeiculoResponse;
import com.senac.locaauto.service.VeiculoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/veiculo")
@Tag(name = "Veiculo")
@CrossOrigin("*")
public class VeiculoController {
    @Autowired
    private VeiculoService service;

    @PostMapping("/save")
    public ResponseEntity<VeiculoResponse> save(@RequestBody VeiculoRequest request) {
        if(request.getId() != null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            VeiculoResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/update")
    public ResponseEntity<VeiculoResponse> update(@RequestBody VeiculoRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            VeiculoResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/delete")
    public ResponseEntity<VeiculoResponse> delete(@RequestBody IdRequest request) {
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
    public ResponseEntity<VeiculoResponse> findById(@RequestBody IdRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            VeiculoResponse response = service.findById(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<VeiculoResponse>> listAll() {
        try{
            List<VeiculoResponse> response = service.listAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
