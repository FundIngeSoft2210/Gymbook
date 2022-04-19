/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import login.Clases.Entrenadores;
import login.Clases.Gymnasio;
import login.Clases.Usuario;
import login.Clases.cliente;

/**
 *
 * @author julio
 */
public class login {
    private HashMap<Integer,Usuario> lista_De_Usuarios= new HashMap <>();
    private List<cliente> lista_de_clientes= new ArrayList<>();
    private List<Entrenadores> lista_de_entrenadores = new ArrayList<>();
    private List<Gymnasio> lista_de_gimnasios = new ArrayList<>();
    

    public HashMap<Integer, Usuario> getLista_De_Usuarios() {
        return lista_De_Usuarios;
    }

    public void setLista_De_Usuarios(HashMap<Integer, Usuario> lista_De_Usuarios) {
        this.lista_De_Usuarios = lista_De_Usuarios;
    }
    public void insertarUsuario(String username,String contrasena){
        Usuario nuevoUsuario = new Usuario(username,contrasena);
        this.lista_De_Usuarios.put(this.lista_De_Usuarios.size()+1,nuevoUsuario);
    }    
    
    boolean existe_el_usuario(String username,String contrasena){
        Usuario usuarioARevisar = new Usuario(username,contrasena);
        return this.lista_De_Usuarios.containsValue(usuarioARevisar);
    }
    
    void guardarTodo() throws FileNotFoundException,IOException {
        this.guardar();
        this.guardarEntrenadores();
        this.guardarClientes();
        this.guardarGimnasios();
    }
    void cargarTodo() throws FileNotFoundException,IOException, ClassNotFoundException {
        this.cargar();
        this.cargarEntrenadores();
        this.cargarClientes();
        this.cargarGimnasios();
    }
    
    void guardar() throws FileNotFoundException, IOException{
        FileOutputStream ArchivoAEscribir = new FileOutputStream("UsuariosYContrasenas");
        ObjectOutputStream Salida = new ObjectOutputStream(ArchivoAEscribir);
        Salida.writeObject(this.lista_De_Usuarios);
        
    }
    
    void cargar() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream ArchivoAEscribir = new FileInputStream("UsuariosYContrasenas");
        ObjectInputStream entrada = new ObjectInputStream(ArchivoAEscribir);
        
        this.lista_De_Usuarios.putAll((Map<? extends Integer, ? extends Usuario>) entrada.readObject());
    }
    
    void guardarEntrenadores() throws FileNotFoundException, IOException{
        FileOutputStream ArchivoAEscribir = new FileOutputStream("ListaDeEntrenadores");
        ObjectOutputStream Salida = new ObjectOutputStream(ArchivoAEscribir);
        Salida.writeObject(this.lista_de_entrenadores);
        
    }
    
    void cargarEntrenadores() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream ArchivoAEscribir = new FileInputStream("ListaDeEntrenadores");
        ObjectInputStream entrada = new ObjectInputStream(ArchivoAEscribir);
        
        this.lista_de_entrenadores.addAll((Collection<? extends Entrenadores>) entrada.readObject());
    }
    
    void guardarClientes() throws FileNotFoundException, IOException{
        FileOutputStream ArchivoAEscribir = new FileOutputStream("ListadeClientes");
        ObjectOutputStream Salida = new ObjectOutputStream(ArchivoAEscribir);
        Salida.writeObject(this.lista_de_clientes);
        
    }
    
    void cargarClientes() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream ArchivoAEscribir = new FileInputStream("ListadeClientes");
        ObjectInputStream entrada = new ObjectInputStream(ArchivoAEscribir);
        
        this.lista_de_clientes.addAll((Collection<? extends cliente>) entrada.readObject());
    }
    
    void guardarGimnasios() throws FileNotFoundException, IOException{
        FileOutputStream ArchivoAEscribir = new FileOutputStream("ListadeGimnasios");
        ObjectOutputStream Salida = new ObjectOutputStream(ArchivoAEscribir);
        Salida.writeObject(this.lista_de_gimnasios);
        
    }
    
    void cargarGimnasios() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream ArchivoAEscribir = new FileInputStream("ListadeGimnasios");
        ObjectInputStream entrada = new ObjectInputStream(ArchivoAEscribir);
        
        this.lista_de_gimnasios.addAll((Collection<? extends Gymnasio>) entrada.readObject());
    }
       
}
