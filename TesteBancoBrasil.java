public class TesteBancoBrasil
{
    public static void main(String[] args){
        BancoBrasil banco = new BancoBrasil();
        
        ContaEstudante contae = new ContaEstudante();
        banco.addContaEstudante(contae);
        
        ContaCorrente contac = new ContaCorrente();
        banco.addContaCorrente(contac);
        
        System.out.println(banco.ContasEstudante().size());
        System.out.println(banco.ContasCorrente().size());         
        System.out.println(banco.saldoTotal());
    }
}
