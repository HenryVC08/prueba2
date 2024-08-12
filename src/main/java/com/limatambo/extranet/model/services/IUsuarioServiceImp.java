package com.limatambo.extranet.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limatambo.extranet.model.DAO.IUsuarioDAO;
import com.limatambo.extranet.model.entidad.Usuario;

@Service
public class IUsuarioServiceImp implements IUsuarioService{

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> mostrarUsuario() {
        return (List<Usuario>)usuarioDAO.findAll();
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioDAO.findById(id).orElse(null);
    }

}
