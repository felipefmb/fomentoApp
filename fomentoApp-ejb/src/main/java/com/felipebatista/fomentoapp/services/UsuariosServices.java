/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.services;

import com.felipebatista.fomentoapp.model.Usuarios;
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
public class UsuariosServices extends AbstractCrudService<Usuarios>{

    @Inject
    private GenericDAO<Usuarios> dao;
    
    @Override
    protected GenericDAO<Usuarios> getDao() {
        return dao;
    }
    
}
