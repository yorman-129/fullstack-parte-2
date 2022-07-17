package com.administrativo.demo.service;

import com.administrativo.demo.model.Administrative;
import com.administrativo.demo.repository.AdministrativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Administrative administrative1= new Administrative();
        ///
        return administrativeRepository.save(administrative1);
    }

    @Override
    public void deleteAdministrative(Administrative administrative, Long id) {
        administrativeRepository.deleteById(id);
    }

    @Override
    public Administrative searchById(Long id) {
        return administrativeRepository.findById(id).orElse(null);
    }
}
