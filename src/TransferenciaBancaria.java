public class TransferenciaBancaria extends MetodoPago{


    public TransferenciaBancaria(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void realizarPago(double monto) {
        double cobro=monto+(monto*5);
        if(saldoDisponible>=cobro){
            saldoDisponible-=cobro;
            System.out.println("Su transaccion es de : $"+cobro);
        } else {
            System.out.println("Saldo insuficiente");
        }
        MostrarSaldo();
    }
}
