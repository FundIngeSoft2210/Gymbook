/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author MAIKOL
 */

import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import login.Clases.Metas;
import login.Clases.Resultados;
import login.Clases.Usuario;

public class Bases {
    
    private String archivoUsuarios;
    private String archivoMetas;
    private String archivoResultados;

    void muestraContenido(String archivo) throws FileNotFoundException, IOException { 
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
    public Usuario[] archivosArrayUsuario(String lecturaArchivo) {
    var array = lecturaArchivo.split("\n");
    var array2 = [];
    for (var i = 0; i < array.length; i++) {
        var array3 = array[i].split(",");
        array2.push(array3);
    }
    return array2;
    }
    
    public Resultados [] archivosArrayResultados(String lecturaArchivo) {
    var array = lecturaArchivo.split("\n");
    var array2 = [];
    for (var i = 0; i < array.length; i++) {
        var array3 = array[i].split(",");
        array2.push(array3);
    }
    return array2;
    }
    
    public Metas[] archivosArrayMetas(String lecturaArchivo) {
    var array = lecturaArchivo.split("\n");
    var array2 = [];
    for (var i = 0; i < array.length; i++) {
        var array3 = array[i].split(",");
        array2.push(array3);
    }
    return array2;
    }
}



