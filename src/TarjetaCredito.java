public class TarjetaCredito extends MetodoPago{

    public TarjetaCredito(double saldoInicial) {
        super(saldoInicial);
    }


        @Override
    public void realizarPago(double monto) {
        if(saldoDisponible>=monto){
            saldoDisponible-=monto;
            System.out.println("Puede realizar el pago: $"+monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
        MostrarSaldo();
    }
}
