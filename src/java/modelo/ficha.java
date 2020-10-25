/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author andres
 */
public class ficha {

    private int codigo;
    private String nombre;
    private double tomo;
    private String origen;
    private String editorial;
    private String idioma;
    private String caracteristicas;
    
        public ficha() {
    }

    public ficha(int codigo, String nombre, double tomo, String origen, String editorial, String idioma, String caracteristicas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tomo = tomo;
        this.origen = origen;
        this.editorial = editorial;
        this.idioma = idioma;
        this.caracteristicas = caracteristicas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTomo() {
        return tomo;
    }

    public void setTomo(double tomo) {
        this.tomo = tomo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }



}
