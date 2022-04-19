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
    
    public void registrarUsuario(String nombre,String apellido, long NumeroDocumento,long NumeroTelefonico, Date FechaNacimiento, String direccion, String ocupacion, String EPS,String genero, Double peso,Double altura, String NombreContactoEmergencia,long TelefonoContactoEmergencia, String username,String contrasena){
        
    }
    public boolean verificar_User_contrasena(String username,String contrasena){
        return login.ContrasenaCorrecta(username,contrasena);
    };
}
