//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MetodoPago tarjeta= new TarjetaCredito(2000000);
        MetodoPago paypal= new Paypal(1500000);
        MetodoPago transfer=new TransferenciaBancaria(2600000);

        tarjeta.realizarPago(100000);
        paypal.realizarPago(2500000);
        transfer.realizarPago(500000);
        tarjeta.reembolsarPago(100000);
        paypal.reembolsarPago(2500000);
        transfer.reembolsarPago(500000);
    }
}