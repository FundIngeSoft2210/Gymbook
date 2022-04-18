/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.HashMap;
import login.usuario;

/**
 *
 * @author julio
 */
public class controllerUsuarios {
    private HashMap<Integer,usuario> lista_De_Usuarios= new HashMap <>();

    public HashMap<Integer, usuario> getLista_De_Usuarios() {
        return lista_De_Usuarios;
    }

    public void setLista_De_Usuarios(HashMap<Integer, usuario> lista_De_Usuarios) {
        this.lista_De_Usuarios = lista_De_Usuarios;
    }
    public void insertarUsuario(String username,String contrasena){
        usuario nuevoUsuario = new usuario(username,contrasena);
        this.lista_De_Usuarios.put(this.lista_De_Usuarios.size()+1,nuevoUsuario);
    }    
    
    boolean existe_el_usuario(String username,String contrasena){
        usuario usuarioARevisar = new usuario(username,contrasena);
        if (this.lista_De_Usuarios.containsValue(usuarioARevisar)) return true;
        return false;
    }
    
}
