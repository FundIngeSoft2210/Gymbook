/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;


/**
 *
 * @author julio
 */
public class Entrenadores extends Usuario{
    
    public Entrenadores(String username, String contrasena) {
        super(username, contrasena);
    }

    public Entrenadores(String nombre, String descripcion, String username, String contrasena, Icon imagen) {
        super(username, contrasena, imagen);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Entrenadores(String username, String contrasena,String nombre,String descripcion) {
        super(username, contrasena);
        this.nombre= nombre;
        this.descripcion=descripcion;
    }
    
    private List<cliente> Entrenados = new ArrayList<>();
    private String nombre;
    private String descripcion; 

    public List<cliente> getEntrenados() {
        return Entrenados;
    }

    public void setEntrenados(List<cliente> Entrenados) {
        this.Entrenados = Entrenados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
}