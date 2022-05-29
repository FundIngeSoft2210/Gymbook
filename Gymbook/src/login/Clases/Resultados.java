/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.Clases;

/**
 *
 * @author MAIKOL
 */
public class Resultados {
    
    private String numeroCedulaCliente;
    private int habilidad;
    private int total;

    public Resultados(String numeroCedulaCliente, int habilidad, int total) {
        this.numeroCedulaCliente = numeroCedulaCliente;
        this.habilidad = habilidad;
        this.total = total;
    }
    
    public Resultados() {

    }

    public String getNumeroCedulaCliente() {
        return numeroCedulaCliente;
    }

    public void setNumeroCedulaCliente(String numeroCedulaCliente) {
        this.numeroCedulaCliente = numeroCedulaCliente;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
