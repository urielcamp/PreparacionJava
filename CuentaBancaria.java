public class CuentaBancaria {
    protected String titular;
    protected String tipoCuenta;
    protected int saldo;
    protected double intereses;

    public CuentaBancaria(String titular, String tipoCuenta, int saldo){
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        intereses = 0.0; 
    }

    public void calcularIntereses(){
        if (tipoCuenta == "cuenta de ahorros") {
            saldo -=  (saldo * 0.02);
        }else if (tipoCuenta == "cuenta corriente") {
            saldo -= (saldo * 0.05) ;
        }
    }

    public String getTitular(){
        return titular;
    }

    public String getTipoCuenta(){
        return tipoCuenta;
    }

    public int getSaldo(){
        return saldo;
    }

    public void mostrarSaldo(){
        System.out.println(saldo);
    }
}
