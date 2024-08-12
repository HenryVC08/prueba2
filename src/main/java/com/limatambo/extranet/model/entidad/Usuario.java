package com.limatambo.extranet.model.entidad;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="app_user")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;

    @Column(name="active")
    private int Active;

    @Column(name="created")
    private String Creado;

    @Column(name="modified")
    private String Modificado;
    
    @Column(name="created_by")
    private int Creado_por;

    @Column(name="modified_by")
    private int Modificado_por;
    
    @Column(name="edit_superadmin")
    private int Edit_superAdmin;

    @Column(name="username")
    private String User_name;

    @Column(name="first_name")
    private String Nombre;

    @Column(name="last_name")
    private String Apellido;

    @Column(name="telefono")
    private String Telefono;

    @Column(name="email")
    private String Correo;

    @Column(name="passw")
    private String Pass;

    @Column(name="is_active")
    private int Es_activo;

    @Column(name="is_superuser")
    private int Es_superUser;

    @Column(name="is_extranet")
    private int Es_Extranet;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int active) {
        Active = active;
    }

    public String getCreado() {
        return Creado;
    }

    public void setCreado(String creado) {
        Creado = creado;
    }

    public String getModificado() {
        return Modificado;
    }

    public void setModificado(String modificado) {
        Modificado = modificado;
    }

    public int getCreado_por() {
        return Creado_por;
    }

    public void setCreado_por(int creado_por) {
        Creado_por = creado_por;
    }

    public int getModificado_por() {
        return Modificado_por;
    }

    public void setModificado_por(int modificado_por) {
        Modificado_por = modificado_por;
    }

    public int getEdit_superAdmin() {
        return Edit_superAdmin;
    }

    public void setEdit_superAdmin(int edit_superAdmin) {
        Edit_superAdmin = edit_superAdmin;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public int getEs_activo() {
        return Es_activo;
    }

    public void setEs_activo(int es_activo) {
        Es_activo = es_activo;
    }

    public int getEs_superUser() {
        return Es_superUser;
    }

    public void setEs_superUser(int es_superUser) {
        Es_superUser = es_superUser;
    }

    public int getEs_Extranet() {
        return Es_Extranet;
    }

    public void setEs_Extranet(int es_Extranet) {
        Es_Extranet = es_Extranet;
    }

    

    
}
