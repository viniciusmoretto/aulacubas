public class ContaInvestimento extends Conta implements ImpostoBancario
{
    
    public ContaInvestimento(){
        super(200);
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
