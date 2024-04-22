package com.senac.locaauto.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.locaauto.request.IdRequest;
import com.senac.locaauto.request.ReservaRequest;
import com.senac.locaauto.response.ReservaResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/reserva")
@Tag(name = "Reserva")
@CrossOrigin("*")
public class ReservaController {

    @PostMapping("/save")
    public ResponseEntity<ReservaResponse> save(@RequestBody ReservaRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/update")
    public ResponseEntity<ReservaResponse> update(@RequestBody ReservaRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/delete")
    public ResponseEntity<ReservaResponse> delete(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/find-by-id")
    public ResponseEntity<ReservaResponse> findById(@RequestBody IdRequest entity) {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/list-all")
    public ResponseEntity<List<ReservaResponse>> listAll() {
        
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    
}
