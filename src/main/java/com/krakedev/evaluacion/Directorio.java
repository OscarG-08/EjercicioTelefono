/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oscar
 */
public class Directorio {

    private ArrayList<Contacto> contactos = new ArrayList<>();
    private Date fechaModificacion;
    private ArrayList<Contacto> correctos = new ArrayList<>();
    private ArrayList<Contacto> incorrectos = new ArrayList<>();

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }

    public void setCorrectos(ArrayList<Contacto> correctos) {
        this.correctos = correctos;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }

    public void setIncorrectos(ArrayList<Contacto> incorrectos) {
        this.incorrectos = incorrectos;
    }

    public boolean agregarContacto(Contacto contacto) {
        Contacto resultadoBusqueda = buscarPorCedula(contacto.getCedula());
        if (resultadoBusqueda == null) {
            contactos.add(contacto);
            fechaModificacion = new Date();
            return true;
        }
        return false;
    }

    public Contacto buscarPorCedula(String cedula) {
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contactoActual = contactos.get(i);
            if (contactoActual.getCedula().equals(cedula)) {
                return contactoActual;
            }
        }
        return null;
    }

    public String consultarUltimaModificacion() {
        if (fechaModificacion != null) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            return formatoFecha.format(fechaModificacion);
        } else {
            return "No hay información de última modificación";
        }
    }

    public int contarPerdidos() {
        int contador = 0;
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contactoActual = contactos.get(i);
            if (contactoActual.getDireccion() == null) {
                contador++;
            }
        }
        return contador;
    }

    public int contarFijos() {
        int contador = 0;
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contactoActual = contactos.get(i);
            ArrayList<Telefono> telefonos = contactoActual.getTelefonos();
            for (int j = 0; j < telefonos.size(); j++) {
                Telefono telefonoActual = telefonos.get(j);
                if (telefonoActual.getTipo().equals("Convencional") && telefonoActual.getEstado().equals("C")) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void depurar() {
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contactoActual = contactos.get(i);
            if (contactoActual.getDireccion() == null) {
                incorrectos.add(contactoActual);
            } else {
                correctos.add(contactoActual);
            }
        }
    }
}
