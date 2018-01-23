/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.api;

import com.felipebatista.fomentoapp.model.Clientes;
import com.felipebatista.fomentoapp.services.AbstractCrudService;
import com.felipebatista.fomentoapp.services.ClientesServices;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe
 */
@Path("clientes")
public class ClientesResource extends AbstractCrudResource<Clientes>{

    @Inject
    private ClientesServices service;
    
    @Override
    protected AbstractCrudService<Clientes> getService() {
        return service;
    }
    
}
