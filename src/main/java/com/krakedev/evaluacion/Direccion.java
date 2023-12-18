/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev.evaluacion;

/**
 *
 * @author Oscar
 */
public class Direccion {

    private String callePrincipal;
    private String calleSecundaria;

    public Direccion(String callePrincipal, String calleSecundaria) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

}
