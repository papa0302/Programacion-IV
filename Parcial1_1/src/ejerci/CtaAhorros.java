
package ejerci;


public class CtaAhorros {

    private double valorInt;
    private double sal;

    public CtaAhorros(double valorIntereses, double sal) {
        this.valorInt= valorIntereses;
        this.sal = sal;
    }

    public double getSaldo() {
        return sal;
    }

    public void setSaldo(double saldo) {
        this.sal = saldo;
    }

    public double getValorIntereses() {
        return valorInt;
    }

    public void setValorIntereses(double valorIntereses) {
        this.valorInt = valorIntereses;
    }

    @Override
    public String toString() {
        return "CtaAhorros{"
                + "valorIntereses=" + valorInt + 
                ", saldo=" + sal + '}';
    }

    public void depositarAhorros(double x) {
        if (x < 0) {
            System.out.println("No se puede ingresar valores negativos");
        } else {
            this.sal+= x;
            System.out.println("Se agrego " + x + " a la cuenta de ahorros.");
            System.out.println("Cantidad total: " + this.sal);
        }
    }

    public void retirarCtaAhorros(double cant) {
        if (this.sal < cant) {
            System.out.println("No es posible retirar ");
        } else {
            this.sal -= cant;
            System.out.println("Se retiro " + cant + " de la cuenta de ahorros. ");
            System.out.println("Cantidad total: " + this.sal);
        }

    }

}

