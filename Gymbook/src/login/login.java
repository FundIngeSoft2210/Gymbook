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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import login.Clases.Entrenadores;
import login.Clases.Gymnasio;
import login.Clases.Usuario;
import login.Clases.cliente;

/**
 *
 * @author julio
 */
public class login {
    private HashMap<String,Usuario> lista_De_Usuarios= new HashMap <>();
    private List<cliente> lista_de_clientes= new ArrayList<>();
    private List<Entrenadores> lista_de_entrenadores = new ArrayList<>();
    private List<Gymnasio> lista_de_gimnasios = new ArrayList<>();
    

    public HashMap<String, Usuario> getLista_De_Usuarios() {
        return lista_De_Usuarios;
    }

    public void setLista_De_Usuarios(HashMap<String, Usuario> lista_De_Usuarios) {
        this.lista_De_Usuarios = lista_De_Usuarios;
    }
    public String insertarUsuario(String username,String contrasena){
        Usuario nuevoUsuario = new Usuario(username,contrasena);
        if (!this.existe_el_usuario(username, contrasena)){
            this.lista_De_Usuarios.put(username,nuevoUsuario);
            return "Usuario Insertado correctamente";
        }
        else {
            return "Usuario ya existente";
        }
    }
    public String insertarCliente(String gimnasio, String nombre, String apellido, long numero_Telefono, Date fechaNacimiento, int edad, String direccion, String ocupacion, String EPS, double peso, double altura, String nombre_Contacto_emergencia, long numero_telefono_emergencia, String username, String contrasena, Icon imagen){
        cliente nuevoCliente = new cliente(gimnasio,nombre,apellido, numero_Telefono, fechaNacimiento, edad, direccion, ocupacion, EPS, peso, altura, nombre_Contacto_emergencia, numero_telefono_emergencia, username, contrasena,imagen);
        if (!this.existe_el_usuario(username, contrasena)){
            this.lista_de_clientes.add(nuevoCliente);
        }
        return this.insertarUsuario(username, contrasena);
    }
    public String insertarEntrenador(String nombre, String descripcion, String username, String contrasena, Icon imagen){
        Entrenadores nuevoEntrenador = new Entrenadores(nombre,descripcion,username, contrasena, imagen);
        if (!this.existe_el_usuario(username, contrasena))
            this.lista_de_entrenadores.add(nuevoEntrenador);
        return this.insertarUsuario(username, contrasena);
    }
    
    public String insertarGimnasio(String Nombre_del_Gimnasio, String Direccion, String username, String contrasena, Icon imagen){
        Gymnasio nuevoGimnasio = new Gymnasio(Nombre_del_Gimnasio,Direccion, username, contrasena, imagen);
        if (!this.existe_el_usuario(username, contrasena))
            this.lista_de_gimnasios.add(nuevoGimnasio);
        return this.insertarUsuario(username, contrasena);
    }
    public void eliminarUsuario(String username){
        this.lista_de_clientes.remove(this.lista_De_Usuarios.get(username));
        this.lista_de_entrenadores.remove(this.lista_De_Usuarios.get(username));
        this.lista_de_gimnasios.remove(this.lista_De_Usuarios.get(username));
        this.lista_De_Usuarios.remove(username);
    }
    
    boolean existe_el_usuario(String username,String contrasena){
        Usuario usuarioARevisar = new Usuario(username,contrasena);
        if (this.lista_De_Usuarios.containsKey(username) || this.lista_De_Usuarios.containsValue(usuarioARevisar)){
            return true;
        }
        return false;
    }
    
    boolean ContrasenaCorrecta(String username,String contrasena){
        if (existe_el_usuario(username,contrasena))
                if (contrasena == this.lista_De_Usuarios.get(username).getContrasena())
                    return true;
        
        return false;
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
        
        this.lista_De_Usuarios.putAll((Map<? extends String, ? extends Usuario>) entrada.readObject());
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
