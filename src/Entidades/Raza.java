/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Raza {
    
    private String raza;
    private double tamanio;
    private int velocidad;
    private String[] idioma;
    private int modstats;
    private String comparma;

    public Raza(String raza, double tamanio, int velocidad, String[] idioma, int modstats, String comparma) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.velocidad = velocidad;
        this.idioma[0] = "Comun";
        this.modstats = modstats;
        this.comparma = comparma;
    }

    public Raza() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String nombreRaza) {
        this.raza = nombreRaza;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public int getModstats() {
        return modstats;
    }

    public void setModstats(int modstats) {
        this.modstats = modstats;
    }

    public String getComparma() {
        return comparma;
    }

    public void setComparma(String comparma) {
        this.comparma = comparma;
    }
    
    
    
    public void cargarIdiomas(){};

    @Override
    public String toString() {
        return "Raza{"+raza + ", tamaño=" + tamanio + ", velocidad=" + velocidad + ", idioma=" + idioma + ", modstats=" + modstats + ", comparma=" + comparma + '}';
    }
    
    
    
    
}
