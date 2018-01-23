/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.services;

import com.felipebatista.fomentoapp.model.Necessidades;
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
public class NecessidadesServices extends AbstractCrudService<Necessidades>{

    @Inject
    private GenericDAO<Necessidades> dao;
    
    @Override
    protected GenericDAO<Necessidades> getDao() {
        return dao;
    }
    
}
