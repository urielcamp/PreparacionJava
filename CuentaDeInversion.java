public class CuentaDeInversion extends CuentaBancaria{

    public CuentaDeInversion(String titular, String tipoCuenta, int saldo){
        super(titular, tipoCuenta, saldo);
        
    }

    @Override
    public void calcularIntereses(){
        saldo -=(saldo * 0.1);
    }
}
