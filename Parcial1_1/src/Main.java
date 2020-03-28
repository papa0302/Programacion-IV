
import ejerci.Cliente;
import ejerci.CtaAhorros;
import ejerci.CtaCdt;
import ejerci.CtaCorriente;
import ejerci.Cuenta;
import ejercicio1.Coches;
import ejercicio1.Furgonetas;
import ejercicio1.Motos;
import ejercicio1.Vehiculo;



public class Main {

    public static void main(String[] args) {

        
        CtaCdt ctacdt = new CtaCdt();
        CtaCorriente ctacorriente = new CtaCorriente(30000.00);
        CtaAhorros ctaahorros = new CtaAhorros(0.6, 70000.00);
        ctacdt.abrirCdt(200000.00, 6);
        
        Cuenta cuenta1 = new Cuenta("1", "1453151", ctaahorros, ctacorriente, ctacdt);
        Cliente cliente = new Cliente("1", "juan  ", "654654654", cuenta1);
        
        
        cliente.depositarAhorros(1000);
        cliente.depositarCorriente(7000.00);
        cliente.retirarCtaAhorros(45000.00);
        cliente.retirarCtaCorriente(20000.00);
        System.out.println("");
        cliente.getCuenta().getSaldo();
        cliente.cerrarCdt();
        System.out.println("El nuevo saldo de su cuenta corriente es: " + cliente.getCuenta().getCuenta_corriente().getSaldo());
        System.out.println(" ");
        cliente.getCuenta().getSaldo();
        
        /*
        Vehiculo vehi = new Vehiculo("1", 0, true, 0, furgoneta1, coche1, moto1);
        Motos moto1 = new Motos("VNS28E", 7000.00, true, false);
        Coches coche1 = new Coches("vwa-131", 4152151.00, true, false);
        Furgonetas furgoneta1 = new Furgonetas("rlwq ", 60000.00, "10 tonelado ");
        
        
       
        System.out.println("");
         vehi.alquilarFurgoneta(true);
        
        System.out.println(" ");
        System.out.println(furgoneta1);
        vehi.alquilarCoche(true);
        System.out.println("");
        System.out.println(coche1);
        System.out.println("");
        vehi.alquilarMoto(true);
        System.out.println("");
        System.out.println(moto1);
        System.out.println("");
        vehi.devolverFurgoneta(true);
        System.out.println("");
        System.out.println(furgoneta1);
        System.out.println("");
        vehi.devolverVehiculo("hgsuw", 100005.00);
        System.out.println(furgoneta1);
    }
  */}
}
