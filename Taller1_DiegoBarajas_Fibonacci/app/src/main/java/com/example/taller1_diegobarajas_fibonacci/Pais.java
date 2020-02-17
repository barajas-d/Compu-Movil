package com.example.taller1_diegobarajas_fibonacci;

import java.io.Serializable;

public class Pais implements Serializable {
    private String nombre_pais;
    private String nombre_pais_int;
    private String capital;
    private String sigla;

    public Pais(String nombre_pais, String nombre_pais_int, String capital, String sigla) {
        this.nombre_pais = nombre_pais;
        this.nombre_pais_int = nombre_pais_int;
        this.capital = capital;
        this.sigla = sigla;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public String getNombre_pais_int() {
        return nombre_pais_int;
    }

    public String getCapital() {
        return capital;
    }

    public String getSigla() {
        return sigla;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    public void setNombre_pais_int(String nombre_pais_int) {
        this.nombre_pais_int = nombre_pais_int;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
