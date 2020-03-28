/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci;

/**
 *
 * @author Intel
 */
public class CtaCdt {

    private int mes;
    private double sal;
    //private double cantidadAinvertir;

    public CtaCdt() {
    }

    public int getMes() {
        return mes;
    }

    public void setMeses(int meses) {
        this.mes = meses;
    }

    public double getSaldo() {
        return sal;
    }

    public void setSaldo(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "CtaCdt{" + "Mes=" + mes + ", saldo=" + sal + '}';
    }

    public double abrirCdt(double cantidadInv, int mes) {
        this.sal = cantidadInv;
        this.mes = mes;
        System.out.println("la cuenta de cdt fue exitosa: " + cantidadInv);
        return 0.6;
    }

    public double cerrarCdt() {
        double saldoActual = sal;
        this.sal = 0;
        this.mes = 0;
        return saldoActual;
    }
}

