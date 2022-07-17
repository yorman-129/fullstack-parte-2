package com.administrativo.demo.controller;

import com.administrativo.demo.model.Administrative;
import com.administrativo.demo.repository.AdministrativeRepository;
import com.administrativo.demo.service.AdministrativeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class administrativeController {

    @Autowired
    private AdministrativeServiceImplement administrativeServiceImplement;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveAdministrative(@RequestBody Administrative administrative){
    return new ResponseEntity<>(administrativeServiceImplement.saveAdministrative(administrative), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search/{id}")
    public ResponseEntity<?> findAdministrative(@PathVariable("id") Long id){
        return new ResponseEntity<>(administrativeServiceImplement.searchById(id), HttpStatus.FOUND);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<?> findAdministrative(@PathVariable ("id") Long id,@PathVariable Administrative administrative){
        return new ResponseEntity<>(administrativeServiceImplement.updateAdministrative(administrative, id) , HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> borrarAlumno (@RequestBody Administrative administrative, @PathVariable Long id) {
        administrativeServiceImplement.deleteAdministrative(administrative,id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
