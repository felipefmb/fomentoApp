/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.api;

import com.felipebatista.fomentoapp.model.Fornecedores;
import com.felipebatista.fomentoapp.services.AbstractCrudService;
import com.felipebatista.fomentoapp.services.FornecedoresServices;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe
 */
@Path("fornecedores")
public class FornecedoresResource extends AbstractCrudResource<Fornecedores>{

    @Inject
    private FornecedoresServices service;
    
    @Override
    protected AbstractCrudService<Fornecedores> getService() {
        return service;
    }
    
}
