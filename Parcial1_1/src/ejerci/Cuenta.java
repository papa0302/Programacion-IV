/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci;

import ejerci.CtaCorriente;

public class Cuenta {
    
    private String idCuenta;
    private String cedula;
    private ejerci.CtaAhorros cuenta_ahorros;
    private CtaCorriente cuenta_corriente;
    private ejerci.CtaCdt cuenta_cdt;
    private double saldo;

    public Cuenta(String idCuenta, String cedula, ejerci.CtaAhorros cuenta_ahorros, CtaCorriente cuenta_corriente, ejerci.CtaCdt cuenta_cdt) {
        this.idCuenta = idCuenta;
        this.cedula = cedula;
        this.cuenta_ahorros = cuenta_ahorros;
        this.cuenta_corriente = cuenta_corriente;
        this.cuenta_cdt = cuenta_cdt;  
    }
     
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public String toString() {
        return "la cuenta es {" +
                "idCuenta=" + idCuenta +
                ", cedula=" + cedula + '}';
    }

    public ejerci.CtaAhorros getCuenta_ahorros() {
        return cuenta_ahorros;
    }

    public void setCuenta_ahorros(ejerci.CtaAhorros cuenta_ahorros) {
        this.cuenta_ahorros = cuenta_ahorros;
    }

    public CtaCorriente getCuenta_corriente() {
        return cuenta_corriente;
    }

    public void setCuenta_corriente(CtaCorriente cuenta_corriente) {
        this.cuenta_corriente = cuenta_corriente;
    }

    public ejerci.CtaCdt getCuenta_cdt() {
        return cuenta_cdt;
    }

    public void setCuenta_cdt(ejerci.CtaCdt cuenta_cdt) {
        this.cuenta_cdt = cuenta_cdt;
    }

    public double getSaldo() {
        double corriente = cuenta_corriente.getSaldo();
        double ahorros = cuenta_ahorros.getSaldo();
        double cdt = cuenta_cdt.getSaldo();
        double saldoTotal= corriente + ahorros + cdt;
        System.out.println("El saldo total es: " + saldoTotal + "\n"+
                "discriminado de la siguiente forma: "+ "\n"+ "Cuenta de ahorros: " +  ahorros + "\n"+
                "Cuenta corriente: " + corriente + "\n" +
                "Cuenta CDT: " + cdt);
        return saldoTotal;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
}