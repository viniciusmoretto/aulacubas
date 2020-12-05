import java.util.ArrayList;

public class BancoBrasil
{
	
    private ArrayList<ContaEstudante> contasEstudante = new ArrayList();
    private ArrayList<ContaCorrente> contasCorrente = new ArrayList();
    
    public void addContaEstudante(ContaEstudante conta){
        contasEstudante.add(conta);
    }
    
    public void addContaCorrente(ContaCorrente conta) {
    	contasCorrente.add(conta);
    }
    
    public ArrayList<ContaEstudante> ContasEstudante(){
        return this.contasEstudante;
    }
    
    
    public double saldoTotal(){
    	double soma = 0;
        
    	for(int i = 0; i < contasEstudante.size(); i ++) {	
        	ContaEstudante contaEstudante = constasEstudante.get(i);
        	soma += contaEstudante.pegaSaldo();
        }
    	
    	for(int i = 0; i < contasCorrente.size(); i++) {
    		ContaCorrente contaCorrente = contasCorrente.get(i);
    		soma += contaCorrente.pegaSaldo();
    	}
    	
        return soma;
    }
   
}