public abstract class MetodoPago implements Pago {
    double saldoDisponible;

    public MetodoPago(double saldoInicial) {
        this.saldoDisponible=saldoInicial;
    }

    @Override
    public void realizarPago(double monto) {
    }

    @Override
    public void reembolsarPago(double monto) {
        saldoDisponible+=monto;
        System.out.println("Reembolso: "+saldoDisponible);
    }

    public void MostrarSaldo(){
        System.out.println("Saldo disponible: "+saldoDisponible);
    }
}
