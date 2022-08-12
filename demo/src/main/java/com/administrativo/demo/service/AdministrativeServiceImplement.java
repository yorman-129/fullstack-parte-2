package com.administrativo.demo.service;

import com.administrativo.demo.model.Administrative;
import com.administrativo.demo.repository.AdministrativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativeServiceImplement implements AdministrativeServiceInterface{
    @Autowired
    private AdministrativeRepository administrativeRepository;

    @Override
    public Administrative saveAdministrative(Administrative administrative) {
        return administrativeRepository.save(administrative);
    }

    @Override
    public Administrative updateAdministrative(Administrative administrative, Long id) {
        Administrative administrative1= administrativeRepository.findById(id).get();
        administrative1.setCargo(administrative.getCargo());
        administrative1.setDireccion(administrative.getDireccion());
        administrative1.setSalario(administrative.getSalario());
        administrative1.setNombreCompleto(administrative.getNombreCompleto());
        administrative1.setTipoContrato(administrative.getTipoContrato());
        administrative1.setTelefono(administrative.getTelefono());

        ///
        return administrativeRepository.save(administrative1);
    }

    @Override
    public void deleteAdministrative( Long id) {
        administrativeRepository.deleteById(id);
    }

    @Override
    public Administrative searchById(Long id) {
        return administrativeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Administrative> findAll() {
        return (List<Administrative>) administrativeRepository.findAll();
    }
}
