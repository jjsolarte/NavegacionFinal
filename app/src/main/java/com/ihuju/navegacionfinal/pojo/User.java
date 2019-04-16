package com.ihuju.navegacionfinal.pojo;

public class User {

    String nombre;
    String imagen;
    int edad;

    public User(String nombre, String imagen, int edad) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
