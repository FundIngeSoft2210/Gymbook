/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author julio
 */
public class usuario {
    private String username;
    private String contrasena;

    public String getUsername() {
        return username;
    }

    public usuario(String username, String contrasena) {
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
