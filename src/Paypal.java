public class Paypal extends MetodoPago{
    public Paypal(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void realizarPago(double monto) {
        double cobro=monto+(monto*0.02);
        if(saldoDisponible>=cobro){
            saldoDisponible-=cobro;
            System.out.println("Puede realizar el pago: $"+monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
        MostrarSaldo();
    }
}
