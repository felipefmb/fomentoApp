/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.api;

import com.felipebatista.fomentoapp.services.AbstractCrudService;
import com.felipebatista.fomentoapp.services.UsuariosServices;
import com.felipebatista.fomentoapp.model.Usuarios;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe
 */
@Path("usuarios")
public class UsuariosResource extends AbstractCrudResource<Usuarios>{

    @Inject
    private UsuariosServices service;
    
    @Override
    protected AbstractCrudService<Usuarios> getService() {
        return service;
    }
    
}
