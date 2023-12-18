/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev.evaluacion;

/**
 *
 * @author Oscar
 */
public class Telefono {

    private String numero;
    private String tipo;
    private String estado;

    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        valorEstado();
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    private void valorEstado() {
        if (numero == null || tipo == null) {
            this.estado = "E";
        } else if (tipo.equals("Movil") || tipo.equals("Convencional")) {
            if ((tipo.equals("Movil") && numero.length() == 10) || (tipo.equals("Convencional") && numero.length() == 7)) {
                this.estado = "C";
            } else {
                this.estado = "E";
            }

        } else {
            this.estado = "E";
        }

    }
}
