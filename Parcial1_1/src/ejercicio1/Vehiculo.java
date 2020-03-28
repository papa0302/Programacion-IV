/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;



public class Vehiculo {
    
    private String  matricula;
    private double kilometrajetotal;
    private boolean estadoDeAl;
    private double tarifa;
    private Furgonetas furgoneta;
    private Coches coche;
    private Motos moto;

    public Vehiculo(String matricula, double kilometrajetotal, boolean estadoDeAl, double tarifa, Furgonetas furgoneta, Coches coche, Motos moto) {
        this.matricula = matricula;
        this.kilometrajetotal = kilometrajetotal;
        this.estadoDeAl = estadoDeAl;
        this.tarifa = tarifa;
        this.furgoneta = furgoneta;
        this.coche = coche;
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", kilometrajeAcomulado=" + kilometrajetotal + ", estado del disponi=" + estadoDeAl + ", precios=" + tarifa + ", furgoneta=" + furgoneta + ", coche=" + coche + ", moto=" + moto + '}';
    }
    

    public Motos getMoto() {
        return moto;
    }

    public void setMoto(Motos moto) {
        this.moto = moto;
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

    public boolean isEstadoDeAlquilado() {
        return estadoDeAl;
    }

    public void setEstadoDeAlquilado(boolean estadoDeAlquilado) {
        this.estadoDeAl = estadoDeAlquilado;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Furgonetas getFurgoneta() {
        return furgoneta;
    }

    public void setFurgoneta(Furgonetas furgoneta) {
        this.furgoneta = furgoneta;
    }

    public Coches getCoche() {
        return coche;
    }

    public void setCoche(Coches coche) {
        this.coche = coche;
    }
    
    public void alquilarFurgoneta(boolean x){
       furgoneta.alquilarFurgoneta();
    }
   public void alquilarCoche(boolean x){
       coche.alquilarCoche();
    } 
    public void alquilarMoto(boolean x){
       moto.alquilarMoto();
    }
    public void devolverFurgoneta(boolean x){
        furgoneta.devolverFurgoneta();
    }
    public void devolverCoche(boolean x){
        coche.devolverCoche();
    }
    public void devolverMoto(boolean x){
        moto.devolverMoto();
    }
    public double devolverVehiculo(String matricula, double kilometra){
           double r,t;
           this.kilometrajetotal= kilometra;
           r= kilometra-this.furgoneta.getKilometrajeAcomulado();
           t= r * furgoneta.getTarifa();
           System.out.println("precios  alquiler: " + t);
        return 0;
       }
    }
