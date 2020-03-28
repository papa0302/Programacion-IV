/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Furgonetas{

    private String matricula;
    private double kilometrajetotal;
    private String capacidadCarga;
    private boolean estadoDeAlquilado = false;
    private double tarifa = 0.5;

    public Furgonetas(String matricula, double kilometrajetotal, String capacidadCarga) {
        this.matricula = matricula;
        this.kilometrajetotal = kilometrajetotal;
        this.capacidadCarga = capacidadCarga;
    }


    @Override
    public String toString() {
        return "Datos del vehiculo: " + "\n"
                + "Matricula: " + matricula + "\n"
                + "Kilometraje total: " + kilometrajetotal + "\n"
                + "Capacidad de Carga: " + capacidadCarga + "\n"
                + "estado de alquiler: " + estadoDeAlquilado + "\n"
                + "precios de alquiler : " + tarifa + " " + "Euros x Kilometro";
    }

    public boolean isEstadoDeAlquilado() {
        return estadoDeAlquilado;
    }

    public void setEstadoDeAlquilado(boolean estadoDeAlquilado) {
        this.estadoDeAlquilado = estadoDeAlquilado;
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

    public void setKilometrajeAcomulado(double kilometrajetotal) {
        this.kilometrajetotal = kilometrajetotal;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void alquilarFurgoneta() {
        this.estadoDeAlquilado = true;
        System.out.println("se alqulo la furgoneta numero placa : " + matricula);
    }

    public void devolverFurgoneta() {
        this.estadoDeAlquilado = false;
        System.out.println("entregaste la furgoneta : " + matricula);
    }
}
