package com.felipebatista.fomentoapp.api;

import com.felipebatista.fomentoapp.model.Propostas;
import com.felipebatista.fomentoapp.services.PropostasServices;
import com.felipebatista.fomentoapp.services.AbstractCrudService;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe
 */
@Path("propostas")
public class PropostasResource extends AbstractCrudResource<Propostas>{

    @Inject
    private PropostasServices service;
    
    @Override
    protected AbstractCrudService<Propostas> getService() {
        return service;
    }
    
}
