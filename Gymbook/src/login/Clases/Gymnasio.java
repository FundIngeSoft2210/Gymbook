/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class Gymnasio extends login.Clases.Usuario{

    public Gymnasio(String username, String contrasena) {
        super(username, contrasena);
    }
    
    public Gymnasio(String username,String contrasena,String nombre,String direccion){
        super(username,contrasena);
        
        this.Nombre_del_Gimnasio=nombre;
        this.Direccion=direccion;
    }
        
    private List<Entrenadores> lista_Entrenadores=new ArrayList <>();
    private List<cliente> lista_Clientes = new ArrayList<>();   
    private String Nombre_del_Gimnasio;
    private String Direccion;

    public List<Entrenadores> getLista_Entrenadores() {
        return lista_Entrenadores;
    }

    public void setLista_Entrenadores(List<Entrenadores> lista_Entrenadores) {
        this.lista_Entrenadores = lista_Entrenadores;
    }

    public List<cliente> getLista_Clientes() {
        return lista_Clientes;
    }

    public void setLista_Clientes(List<cliente> lista_Clientes) {
        this.lista_Clientes = lista_Clientes;
    }

    public String getNombre_del_Gimnasio() {
        return Nombre_del_Gimnasio;
    }

    public void setNombre_del_Gimnasio(String Nombre_del_Gimnasio) {
        this.Nombre_del_Gimnasio = Nombre_del_Gimnasio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    void insertarCliente(cliente cliente){
        this.lista_Clientes.add(cliente);
    }
    
    void insertar_Entrenador(Entrenadores Entrenador){
        this.lista_Entrenadores.add(Entrenador);
    }
    
    
}