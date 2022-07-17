package com.administrativo.demo.service;

import com.administrativo.demo.model.Administrative;

public interface AdministrativeServiceInterface {
    public Administrative saveAdministrative(Administrative administrative);
    public Administrative updateAdministrative(Administrative administrative, Long id);
    void deleteAdministrative(Administrative administrative, Long id);
    public Administrative searchById(Long id);
}
