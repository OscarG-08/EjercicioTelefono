/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev.evaluacion;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Contacto {

    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private ArrayList<Telefono> telefonos = new ArrayList<>();

    public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println("***" + nombre + " " + apellido + "***");
        if (direccion == null) {
            System.out.println("No tiene direccion");
        } else {
            System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
        }

    }

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    public void mostrarTelefonos() {
        System.out.println("Telefonos con estados 'C':");
        for (int i = 0; i < telefonos.size(); i++) {
            Telefono telefonoActual = telefonos.get(i);
            if (telefonoActual.getEstado().equals("C")) {
                System.out.println("Numero: " + telefonoActual.getNumero() + ", Tipo: " + telefonoActual.getTipo());
            }
        }
    }

    public ArrayList<Telefono> recuperarIncorrectos() {
        ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();
        for (int i = 0; i < telefonos.size(); i++) {
            Telefono telefonoActual = telefonos.get(i);
            if (telefonoActual.getEstado().equals("E")) {
                telefonosIncorrectos.add(telefonoActual);
            }
        }
        return telefonosIncorrectos;
    }
}
