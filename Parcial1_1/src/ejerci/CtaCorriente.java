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

public class CtaCorriente {
    
    private double sal;

    public CtaCorriente(double sal) {
        this.sal = sal;
    }

    public double getSaldo() {
        return sal;
    }

    public void setSaldo(double saldo) {
        this.sal = saldo;
    }

    @Override
    public String toString() {
        return "la Cuenta Corriente{"
                + " tu saldo es = <<<<" + sal + '}';
    }
    
    public void depositarCorriente(double c){
       if (c < 0) {
            
        } else {
            this.sal += c;
            System.out.println("Se agrego " + c + " a la cuenta Corriente. ");
            System.out.println("Cantidad total: " + this.sal);
        }
   }
    
    public void retirarCtaCorriente(double cantidad) {
        if (this.sal < cantidad) {
            System.out.println("no clumple para retirar  ");
        } else {
            this.sal -= cantidad;
            System.out.println("Se retiro " + cantidad + " de la cuenta de corriente. ");
            System.out.println("valor  total: " + this.sal);
        }
    
}
    
}
