/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class PrestamoLibro {
    private int cod_libro;    
    private String nom_libro;
    private String nom_usuario;
    
    private String fecha_prestamo;
    private String fecha_devolucion;
    private String estado;

    public PrestamoLibro(int cod_libro, String nom_libro) {
        this.cod_libro = cod_libro;
        this.nom_libro = nom_libro;
        
        nom_usuario="";
        fecha_prestamo="";
        fecha_devolucion="";
        estado="";
    }
    
    // Construnctor vacio
    public PrestamoLibro() {
        cod_libro=-1;
        nom_libro="SIN DATO";
        nom_usuario="SIN DATO";
        fecha_prestamo="SIN DATO";
        fecha_devolucion="SIN DATO";
        estado="SIN DATO";
    }

    //SETTERS
    public void setNom_libro(String nom_libro) {
        this.nom_libro = nom_libro;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    //GETTERS

    public int getCod_libro() {
        return cod_libro;
    }

    public String getNom_libro() {
        return nom_libro;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
