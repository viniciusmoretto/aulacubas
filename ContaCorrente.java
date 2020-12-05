public final class ContaCorrente extends Conta implements ImpostoBancario{
    
    private String agencia;
    private String correntista;
    
    public ContaCorrente(){
        super(400.0);
    }
    
    public ContaCorrente(double saldoInicial, String nome){
        super(saldoInicial, nome);
    }
    
    @Override
    public void deposito(double valor)
    {
        double valorCorrigido = valor * 0.10;
        super.deposito(valorCorrigido);
    }
    
    public double calculoJuros(){
        return super.pegaSaldo() * 0.10;
    }
    
    public void setAgencia(String nomeAgencia){
        agencia = nomeAgencia;
    }
    
    public void setCorrentista(String nomeCorrentista){
        correntista = nomeCorrentista;
    }
    
    // metodos da interface impostoBancario
    public double impostoRenda(double valor){
        return this.pegaSaldo() * 0.9;
    }
    
    public double cpmf(double valor){
        return this.pegaSaldo() * 0.6;
    }
    
    public double iof(double valor){
        return this.pegaSaldo() * 0.3;
    }
}
