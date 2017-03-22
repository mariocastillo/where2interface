package com.example.mario.navigationdrawerexample;

/**
 * Created by mario on 22/03/2017.
 */

public class Restaurant {

    private String tipo,nombre,imagen;
    private int distancia;

    public Restaurant(String tipo, String nombre, String imagen,int distancia) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.distancia=distancia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getImagen() {
        return imagen;
    }
}
