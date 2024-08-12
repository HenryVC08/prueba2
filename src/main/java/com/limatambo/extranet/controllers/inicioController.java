package com.limatambo.extranet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.limatambo.extranet.model.entidad.Usuario;
import com.limatambo.extranet.model.services.IUsuarioService;


@Controller
public class inicioController {
    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping("/")
    public String inicio(){
        
        return("index");
    }

    @RequestMapping("/inicioSesion/{usuario}/{pass}")
    public String inicioSesion(
        @PathVariable String usuario,
        @PathVariable String pass,
        Model model
    ){
        String ruta="";
        int rol = 1;

        for(Usuario userBusca : usuarioService.mostrarUsuario()){
            if(userBusca.getUser_name().equals(usuario) && userBusca.getPass().equals(pass)){

                ruta = userBusca.getEs_superUser()==rol? "redirect:/Estado/Cuenta" : "redirect:/Estado/Cuenta";
                break;
            }else{
                ruta="redirect:/";
            }
        }

        return ruta;

    }


}
