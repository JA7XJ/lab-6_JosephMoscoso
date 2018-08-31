/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josephmoscoso;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class Peliculas {

    private String Nombre;
    private String Duracion;
    private String Categoria;
    ArrayList<String> Actores = new ArrayList();
    private String Director;
    private String Compañia;
    private String Idioma;
    private String Doblaje;
    private String Subtitulos;

    public Peliculas() {
    }

    public Peliculas(String Nombre, String Duracion, String Categoria, String Director, String Compañia, String Idioma, String Doblaje, String Subtitulos) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Categoria = Categoria;
        this.Director = Director;
        this.Compañia = Compañia;
        this.Idioma = Idioma;
        this.Doblaje = Doblaje;
        this.Subtitulos = Subtitulos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Curacion) {
        this.Duracion = Curacion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public ArrayList<String> getActores() {
        return Actores;
    }

    public void setActores(ArrayList<String> Actores) {
        this.Actores = Actores;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getDoblaje() {
        return Doblaje;
    }

    public void setDoblaje(String Doblaje) {
        this.Doblaje = Doblaje;
    }

    public String getSubtitulos() {
        return Subtitulos;
    }

    public void setSubtitulos(String Subtitulos) {
        this.Subtitulos = Subtitulos;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
