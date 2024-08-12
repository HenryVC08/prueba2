package com.limatambo.extranet.model.services;

import java.util.List;

import com.limatambo.extranet.model.entidad.Usuario;

public interface IUsuarioService {
    public List<Usuario> mostrarUsuario();
    public Usuario  buscarUsuario(Long id);

}
