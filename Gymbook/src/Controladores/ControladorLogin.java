/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.Date;
import login.login;

/**
 *
 * @author julio
 */
public class ControladorLogin {
    
    private login login = new login();

    public ControladorLogin() {
    }
    
    public int registrarUsuario(String TipodeUsuario,String nombre,String apellido, long NumeroDocumento,long NumeroTelefonico, String FechaNacimiento, String direccion, String ocupacion, String EPS,String genero, Double peso,Double altura, String NombreContactoEmergencia,long TelefonoContactoEmergencia, String username,String contrasena,int edad, String gimnasio){
        if (login.existe_el_usuario(username, contrasena)) return 0;
        login.insertarUsuario(username, contrasena);
        if(TipodeUsuario=="Cliente"){
            login.insertarCliente(gimnasio, nombre, apellido, NumeroTelefonico, FechaNacimiento, edad, direccion, ocupacion, EPS, peso, altura, NombreContactoEmergencia, NumeroTelefonico, username, contrasena);
        }
        else if(TipodeUsuario=="Entrenador"){
            login.insertarEntrenador(nombre, direccion, username, contrasena, null);
        }else{
            login.insertarGimnasio(gimnasio, direccion, username, contrasena, null);
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
}
