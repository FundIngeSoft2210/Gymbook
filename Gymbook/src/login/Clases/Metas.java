/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.Clases;

import java.util.Date;

/**
 *
 * @author MAIKOL
 */
public class Metas {
    
    private String idMeta;
    private String nombremeta;
    private String fechaFin;
    private String areaGanancia;
    private int PuntosGanancia;
    private String estadometa;
    private String tipometa;

    public Metas(String idMeta, String nombremeta, String fechaFin, String areaGanancia, int PuntosGanancia, String estadometa, String tipometa) {
        this.idMeta = idMeta;
        this.nombremeta = nombremeta;
        this.fechaFin = fechaFin;
        this.areaGanancia = areaGanancia;
        this.PuntosGanancia = PuntosGanancia;
        this.estadometa = estadometa;
        this.tipometa = tipometa;
    }
    public Metas() {

    }

    public String getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(String idMeta) {
        this.idMeta = idMeta;
    }

    public String getNombremeta() {
        return nombremeta;
    }

    public void setNombremeta(String nombremeta) {
        this.nombremeta = nombremeta;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getAreaGanancia() {
        return areaGanancia;
    }

    public void setAreaGanancia(String areaGanancia) {
        this.areaGanancia = areaGanancia;
    }

    public int getPuntosGanancia() {
        return PuntosGanancia;
    }

    public void setPuntosGanancia(int PuntosGanancia) {
        this.PuntosGanancia = PuntosGanancia;
    }

    public String getEstadometa() {
        return estadometa;
    }

    public void setEstadometa(String estadometa) {
        this.estadometa = estadometa;
    }

    public String getTipometa() {
        return tipometa;
    }

    public void setTipometa(String tipometa) {
        this.tipometa = tipometa;
    }
        
}
