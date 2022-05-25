/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.Date;
import login.Clases.Usuario;
import login.login;
import login.Clases.Usuario;

/**
 *
 * @author julio
 */
public class ControladorLogin {
    
    private login login = new login();
    private Usuario actual = new Usuario();
    private String user;
    private String areasTrabajo;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Usuario getActual() {
        return actual;
    }

    public void setActual(Usuario actual) {
        this.actual = actual;
    }

    public ControladorLogin() {
    }
    
    public int registrarUsuario(String TipodeUsuario,String nombre,String apellido, long NumeroDocumento,long NumeroTelefonico, String FechaNacimiento, String direccion, String ocupacion, String EPS,String genero, Double peso,Double altura, String NombreContactoEmergencia,long TelefonoContactoEmergencia, String username,String contrasena,int edad, String gimnasio){
        if (login.existe_el_usuario(username, contrasena)) return 0;
        login.insertarUsuario(username, contrasena);
        if(TipodeUsuario=="Cliente"){
            login.insertarCliente(gimnasio, nombre, apellido, NumeroTelefonico,NumeroDocumento, FechaNacimiento, edad, direccion, ocupacion, EPS, peso, altura, NombreContactoEmergencia, NumeroTelefonico, username, contrasena);
        }
        else if(TipodeUsuario=="Entrenador"){
            login.insertarEntrenador(apellido,nombre, username, contrasena,areasTrabajo);
        }else{
            login.insertarGimnasio(gimnasio, direccion, username, contrasena);
        }
        return 1;
    }
    public boolean verificar_User_contrasena(String username,String contrasena){
        return login.ContrasenaCorrecta(username,contrasena);
    };
    public boolean existe_el_Usuario(String name,String contrasena){
        if(login.existe_el_usuario(name, contrasena)){
            return true;
        }else{
            return false;
        }
    }

    public login getLogin() {
        return login;
    }

    public void setLogin(login login) {
        this.login = login;
    }
}
