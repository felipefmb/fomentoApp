/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.api;

import com.felipebatista.fomentoapp.api.AbstractCrudResource;
import com.felipebatista.fomentoapp.model.Necessidades;
import com.felipebatista.fomentoapp.services.AbstractCrudService;
import com.felipebatista.fomentoapp.services.NecessidadesServices;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe
 */
@Path("necessidades")
public class NecessidadesResource extends AbstractCrudResource<Necessidades>{

    @Inject
    private NecessidadesServices service;
    
    @Override
    protected AbstractCrudService<Necessidades> getService() {
        return service;
    }
    
}
