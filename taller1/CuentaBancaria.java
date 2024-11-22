package taller1;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {
        numeroCuenta = "0000";
        saldo = 0.0;
        tipoCuenta = "Ahorro";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
}
