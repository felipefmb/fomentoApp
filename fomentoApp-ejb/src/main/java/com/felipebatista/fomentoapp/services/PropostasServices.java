package com.felipebatista.fomentoapp.services;

import com.felipebatista.fomentoapp.model.Propostas;
import com.felipebatista.fomentoapp.util.GenericDAO;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 *
 * @author Felipe
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PropostasServices extends AbstractCrudService<Propostas>{

    @Inject
    private GenericDAO<Propostas> dao;
    
    @Override
    protected GenericDAO<Propostas> getDao() {
        return dao;
    }
    
    
    
}
