/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Coches{

    private String matricula;
    private double kilometrajetotal;
    private boolean estado;
    private boolean extras;
    private double tarifa = 0.4;

    public Coches(String matricula, double kilometrajetotal, boolean estadoDeAlquilado, boolean extras) {
        this.matricula = matricula;
        this.kilometrajetotal = kilometrajetotal;
        this.estado = estadoDeAlquilado;
        this.extras = extras;
    }



    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKilometrajeAcomulado() {
        return kilometrajetotal;
    }

    public void setKilometrajeAcomulado(double kilometrajeAcomulado) {
        this.kilometrajetotal = kilometrajeAcomulado;
    }

    public boolean isEstadoDeAlquilado() {
        return estado;
    }

    public void setEstadoDeAlquilado(boolean estadoDeAlquilado) {
        this.estado = estadoDeAlquilado;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Datos del coche: " + "\n" +
                "Matricula: " + matricula + "\n" +
                "Kilometraje acomulado: " + kilometrajetotal + "\n" +
                "Estad de Alquilado: " + estado + "\n" +
                "Extras: " + extras + "\n" +
                "Tarifa: " + tarifa +" "+ "Eu x Kilometro";
    }
    
    public void alquilarCoche(){
        this.estado = true;
        System.out.println("el numero de matricula alquilado: " + matricula);
        
    }
    
    public void  devolverCoche(){
        this.estado = false;
        System.out.println("Se ha devuelto : " + matricula);
    }
    
}
