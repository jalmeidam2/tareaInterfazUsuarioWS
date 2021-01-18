package com.example.tareainterfazusuariows.Adaptador;

public class Adaptador {
    private String nombre;
    private String mensaje;
    private int foto;
    public Adaptador()
    {

    }

    public Adaptador(String nombre, String mensaje, int foto) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
