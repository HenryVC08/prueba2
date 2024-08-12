package com.limatambo.extranet.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.limatambo.extranet.model.entidad.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario,Long>{
    
}
