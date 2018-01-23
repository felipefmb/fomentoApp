package com.felipebatista.fomentoapp.services;

import com.felipebatista.fomentoapp.model.Clientes;
import com.felipebatista.fomentoapp.model.Fornecedores;
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
public class FornecedoresServices extends AbstractCrudService<Fornecedores> {

    @Inject
    private GenericDAO<Fornecedores> dao;
    
    @Override
    protected GenericDAO<Fornecedores> getDao() {
        return dao;
    }
    
}
