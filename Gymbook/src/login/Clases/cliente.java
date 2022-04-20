/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Clases;

import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author julio
 */
public class cliente extends Usuario{
    
    public cliente(String username, String contrasena) {
        super(username, contrasena);
    }
    private String gimnasio;
    private String nombre;
    private String apellido;
    private long numero_Telefono;
    private String fechaNacimiento;
    private int edad;
    private String direccion;
    private String ocupacion;
    private String EPS;
    private double peso;
    private double altura;
    private String nombre_Contacto_emergencia;
    private long numero_telefono_emergencia;

    public cliente(String gimnasio, String nombre, String apellido, long numero_Telefono, String fechaNacimiento, int edad, String direccion, String ocupacion, String EPS, double peso, double altura, String nombre_Contacto_emergencia, long numero_telefono_emergencia, String username, String contrasena, Icon imagen) {
        super(username, contrasena, imagen);
        this.gimnasio = gimnasio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_Telefono = numero_Telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.EPS = EPS;
        this.peso = peso;
        this.altura = altura;
        this.nombre_Contacto_emergencia = nombre_Contacto_emergencia;
        this.numero_telefono_emergencia = numero_telefono_emergencia;
    }

    public cliente(String gimnasio, String nombre, String apelllido, long numero_Telefono, String fechaNacimiento, int edad, String direccion, String ocupacion, String EPS, double peso, double altura, String nombre_Contacto_emergencia, long numero_telefono_emergencia, String username, String contrasena) {
        super(username, contrasena);
        this.gimnasio = gimnasio;
        this.nombre = nombre;
        this.apellido = apelllido;
        this.numero_Telefono = numero_Telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.EPS = EPS;
        this.peso = peso;
        this.altura = altura;
        this.nombre_Contacto_emergencia = nombre_Contacto_emergencia;
        this.numero_telefono_emergencia = numero_telefono_emergencia;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apellido;
    }

    public void setApelllido(String apelllido) {
        this.apellido = apelllido;
    }

    public long getNumero_Telefono() {
        return numero_Telefono;
    }

    public void setNumero_Telefono(long numero_Telefono) {
        this.numero_Telefono = numero_Telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre_Contacto_emergencia() {
        return nombre_Contacto_emergencia;
    }

    public void setNombre_Contacto_emergencia(String nombre_Contacto_emergencia) {
        this.nombre_Contacto_emergencia = nombre_Contacto_emergencia;
    }

    public long getNumero_telefono_emergencia() {
        return numero_telefono_emergencia;
    }

    public void setNumero_telefono_emergencia(long numero_telefono_emergencia) {
        this.numero_telefono_emergencia = numero_telefono_emergencia;
    }
    
}