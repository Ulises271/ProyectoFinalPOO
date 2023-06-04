package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Magos {
    private int id;
    private String Nombre;
    private String Casa;
    private String TipoMago;
    private String Vocacion;
    private String Url;

    public Magos() {
    }

    public Magos(int id, String nombre, String casa, String tipoMago, String vocacion, String url) {
        this.id = id;
        Nombre = nombre;
        Casa = casa;
        TipoMago = tipoMago;
        Vocacion = vocacion;
        Url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCasa() {
        return Casa;
    }

    public void setCasa(String casa) {
        Casa = casa;
    }

    public String getTipoMago() {
        return TipoMago;
    }

    public void setTipoMago(String tipoMago) {
        TipoMago = tipoMago;
    }

    public String getVocacion() {
        return Vocacion;
    }

    public void setVocacion(String vocacion) {
        Vocacion = vocacion;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "Magos{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Casa='" + Casa + '\'' +
                ", TipoMago='" + TipoMago + '\'' +
                ", Vocacion='" + Vocacion + '\'' +
                ", Url='" + Url + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlFoto = new URL(this.Url);
        return new ImageIcon(urlFoto);

    }
}
