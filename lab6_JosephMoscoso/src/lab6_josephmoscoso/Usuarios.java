/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class Usuarios {

    private String nombre;
    private String codigo;
    private String contraseña;

    public Usuarios() {
    }

    public Usuarios(String nombre, String codigo, String contraseña) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", codigo=" + codigo + ", contrase\u00f1a=" + contraseña + '}';
    }

}
