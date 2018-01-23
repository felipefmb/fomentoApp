package com.felipebatista.fomentoapp.api;

import com.felipebatista.fomentoapp.model.Produtos;
import com.felipebatista.fomentoapp.services.AbstractCrudService;
import com.felipebatista.fomentoapp.services.ProdutosServices;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe
 */
@Path("produtos")
public class ProdutosResource extends AbstractCrudResource<Produtos> {
    
    @Inject
    private ProdutosServices service;

    @Override
    protected AbstractCrudService<Produtos> getService() {
        return service;
    }
    
}
