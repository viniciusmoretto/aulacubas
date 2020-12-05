public abstract class Conta 
{
    //Atributos
    private double saldo;
    private String nomeDono;
    
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public Conta(double saldoInicial, String nome){
        this.saldo = saldoInicial;
        this.nomeDono = nome;
    }
    
    public void saque(double s)
    {
        this.saldo = this.saldo - calculaImposto(s);
    }
    public void deposito(double d)
    {
        this.saldo = this.saldo + d;
    }
    
    public double pegaSaldo(){
        return this.saldo;
    }
 
    public void mostrarSaldo()
    {
        System.out.println("R$ " + this.saldo);
    }
 
    public void transferencia(Conta c, double v)
    {
        this.saque(v);
        c.deposito(v);
    }
    
    private double calculaImposto(Double valor){
        return valor * 0.10;
    }
}