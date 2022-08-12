package com.administrativo.demo.controller;

import com.administrativo.demo.model.Administrative;
import com.administrativo.demo.repository.AdministrativeRepository;
import com.administrativo.demo.service.AdministrativeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("administrative")
public class administrativeController {

    @Autowired
    private AdministrativeServiceImplement administrativeServiceImplement;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveAdministrative(@RequestBody Administrative administrative){
    return new ResponseEntity<>(administrativeServiceImplement.saveAdministrative(administrative), HttpStatus.OK);
    }

    @GetMapping(value = "/search/{id}")
    public ResponseEntity<?> findAdministrative(@PathVariable("id") Long id){
        return new ResponseEntity<>(administrativeServiceImplement.searchById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(administrativeServiceImplement.findAll());
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<?> findAdministrative(@PathVariable ("id") Long id,@RequestBody Administrative administrative){
        return new ResponseEntity<>(administrativeServiceImplement.updateAdministrative(administrative, id) , HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> borrarAlumno ( @PathVariable Long id) {
        administrativeServiceImplement.deleteAdministrative(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
