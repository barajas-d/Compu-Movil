package com.example.ejercicio;

public class Pais {

    private String capital;
    private String nombre;
    private String nombre_in;
    private String sigla;

    public Pais(String capital, String nombre, String nombre_in, String sigla) {
        this.capital = capital;
        this.nombre = nombre;
        this.nombre_in = nombre_in;
        this.sigla = sigla;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre_in(String nombre_in) {
        this.nombre_in = nombre_in;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCapital() {
        return capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_in() {
        return nombre_in;
    }

    public String getSigla() {
        return sigla;
    }
}
