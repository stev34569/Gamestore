/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaVideoJuegos.service;

import com.tiendaVideoJuegos.Dao.ClienteDao;
import com.tiendaVideoJuegos.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements clienteService {
    @Autowired
    private ClienteDao clienteDao;
    

    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    
    }

    @Override
    public void delete(Cliente cliente) {
         clienteDao.delete(cliente);
    }
    @Override
    public Cliente getCliente(Cliente cliente) {
       return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
    
}
