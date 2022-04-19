/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Clases;

import javax.swing.Icon;

/**
 *
 * @author julio
 */
public class Usuario {
    private String username;
    private String contrasena;
    private Icon imagen;
    public Usuario(String username, String contrasena, Icon imagen) {
        this.username = username;
        this.contrasena = contrasena;
        this.imagen = imagen;
    }

    public Icon getImagen() {
        return imagen;
    }

    

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public String getUsername() {
        return username;
    }

    public Usuario(String username, String contrasena) {
        this.username = username;
        this.contrasena = contrasena;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}