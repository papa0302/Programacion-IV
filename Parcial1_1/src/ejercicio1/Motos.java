
package ejercicio1;

public class Motos{

    private String matricula;
    private double kilometrajetotal;
    private boolean estadoDeAlquilado;
    private boolean casco;
    private double tarifa = 0.6;

    public Motos(String matricula, double kilometrajeAcomulado, boolean estadoDeAlquilado, boolean casco) {
        this.matricula = matricula;
        this.kilometrajetotal = kilometrajeAcomulado;
        this.estadoDeAlquilado = estadoDeAlquilado;
        this.casco = casco;
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
        return estadoDeAlquilado;
    }

    public void setEstadoDeAlquilado(boolean estadoDeAlquilado) {
        this.estadoDeAlquilado = estadoDeAlquilado;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Datos de la Moto: " + "\n"+
                "Matricula:" + matricula + "\n"+
                "Kilometraje acomulado: " + kilometrajetotal + "\n"+
                "Estado de Alquiler: " + estadoDeAlquilado + "\n"+
                "Casco: " + casco + "\n"+
                "Tarifa: " + tarifa + " " +"Euros x Kilometro";
    }

    public void alquilarMoto() {
        this.estadoDeAlquilado = true;
        System.out.println("Se alquilo la mot : " + matricula);

    }

    public void devolverMoto() {
        this.estadoDeAlquilado = false;
        System.out.println("Se devulve la mot : " + matricula);

    }
}
