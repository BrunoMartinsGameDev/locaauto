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
import com.senac.locaauto.request.ReservaRequest;
import com.senac.locaauto.response.ReservaResponse;
import com.senac.locaauto.service.ReservaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/reserva")
@Tag(name = "Reserva")
@CrossOrigin("*")
public class ReservaController {
    @Autowired
    private ReservaService service;

    @PostMapping("/save")
    public ResponseEntity<ReservaResponse> save(@RequestBody ReservaRequest request) {
        if(request.getId() != null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            ReservaResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/update")
    public ResponseEntity<ReservaResponse> update(@RequestBody ReservaRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            ReservaResponse response = service.save(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/delete")
    public ResponseEntity<ReservaResponse> delete(@RequestBody IdRequest request) {
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
    public ResponseEntity<ReservaResponse> findById(@RequestBody IdRequest request) {
        if(request.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            ReservaResponse response = service.findById(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<ReservaResponse>> listAll() {
        try{
            List<ReservaResponse> response = service.listAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
