/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author MAIKOL
 */

import java.io.BufferedOutputStream;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream;
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import login.Clases.Metas;
import login.Clases.Resultados;
import login.Clases.Usuario;

public class Bases {
    
    private String archivoUsuarios="archivoUsuarios.txt";
    private String archivoMetas="archivoMetas.txt";
        private String archivoResultados="archivoResultados.txt";

    public void escribirUsuario(String usuario, String contrasena, String tipousuario, String nombreGimnacio, String nombreusuario, String apellidousuario, String numerodocumento, String numerotelefono, String fechanacimiento, String Direccionvivienda, String ocupacion, String eps, int edad, String genero, int peso, int altura, String nombreemergencia, String telefonoemergencia) {
        try {
        File file = new File (archivoUsuarios);
        FileOutputStream output = new FileOutputStream(file, true);
        BufferedOutputStream Escritor = new  BufferedOutputStream(output);
        String registroDatos = usuario + ',' + contrasena + ',' + nombreGimnacio +',' + nombreusuario +',' + apellidousuario + ',' + numerodocumento + ',' + numerotelefono + ',' + fechanacimiento +',' + Direccionvivienda + ',' + ocupacion + ',' + eps + ',' + edad + ',' + genero + ',' + peso + ',' + altura + ',' + nombreemergencia + ',' + telefonoemergencia + '\n';
        Escritor.write(registroDatos.getBytes());
        Escritor.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Se genero un problema en la simulacion. \n \nCerrando aplicacion.");
        System.exit(0);
        }
    }

    public void escribirMetas(String idMeta, String nombremeta, Date fechaFin , String areaGanancia,int PuntosGanancia,String estadometa, String tipometa){
        try {
        File file = new File (archivoMetas);
        FileOutputStream output = new FileOutputStream(file, true);
        BufferedOutputStream Escritor = new  BufferedOutputStream(output);
        String registroDatos = idMeta + ',' + nombremeta + fechaFin +',' + areaGanancia + ',' + PuntosGanancia + ',' + estadometa + ',' + tipometa + '\n';
        Escritor.write(registroDatos.getBytes());
        Escritor.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Se genero un problema en la simulacion. \n \nCerrando aplicacion.");
        System.exit(0);
        }
    }
        public void escribirResultados(String numeroCedulaCliente, String habilidad,int total){
        try {
        File file = new File (archivoResultados);
        FileOutputStream output = new FileOutputStream(file, true);
        BufferedOutputStream Escritor = new  BufferedOutputStream(output);
        String registroDatos = numeroCedulaCliente + ',' + habilidad +','+ total +'\n';
        Escritor.write(registroDatos.getBytes());
        Escritor.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Se genero un problema en la simulacion. \n \nCerrando aplicacion.");
        System.exit(0);
    }

    }
    
    public void muestraContenido(String archivo) throws FileNotFoundException, IOException { 
	String cadena; 
	FileReader f = new FileReader(archivo); 
	BufferedReader b = new BufferedReader(f); 
	while((cadena = b.readLine())!=null) { 
		System.out.println(cadena); 
	} 
	b.close(); 
}
    public void leerArchivos (String archivo) throws FileNotFoundException, IOException { 
    	String cadena; 
        FileReader f = new FileReader(archivo); 
        BufferedReader b = new BufferedReader(f); 
        while((cadena = b.readLine())!=null) { 
        	System.out.println(cadena); 
        } 
        b.close(); 
    } 
    public List<String> archivosArrayUsuario(String lecturaArchivo) {
    String[] array = lecturaArchivo.split("\n");
    List<String> array2 = null;
    for (var i = 0; i < array.length; i++) {
        String[] array3 = array[i].split(",");
        array2.add(array3.toString());
    }
    return array2;
    }
    
    public List<String> archivosArrayResultados(String lecturaArchivo) {
    String [] array = lecturaArchivo.split("\n");
    List<String> array2 = null;
    for (var i = 0; i < array.length; i++) {
        var array3 = array[i].split(",");
        array2.add(array3.toString());
    }
    return array2;
    }
    
    public List<String> archivosArrayMetas(String lecturaArchivo) {
    String [] array = lecturaArchivo.split("\n");
    List<String> array2 = null;
    for (var i = 0; i < array.length; i++) {
        var array3 = array[i].split(",");
        array2.add(array3.toString());
    }
    return array2;
    }
}



