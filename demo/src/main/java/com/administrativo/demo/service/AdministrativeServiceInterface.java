package com.administrativo.demo.service;

import com.administrativo.demo.model.Administrative;

import java.util.List;

public interface AdministrativeServiceInterface {
    public Administrative saveAdministrative(Administrative administrative);
    public Administrative updateAdministrative(Administrative administrative, Long id);
    void deleteAdministrative( Long id);
    public Administrative searchById(Long id);
    public List<Administrative> findAll();
}
