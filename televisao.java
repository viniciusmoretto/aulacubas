public class Televisao extends Produto{

    private double peso;
    private double tamanho;
    private double resolucao;


    public Televisao(String fabricante, String nome, double preco, double peso, double tamanho, double resolucao){

        super(fabricante,nome,preco);
        this.peso = peso;
        this.tamanho = tamanho;
        this.resolucao = resolucao;

    }


    public double getPeso(){

        return this.peso;

    }

    public double getTamanho(){

        return this.tamanho;

    }

    public double getResolucao(){

        return this.resolucao;

    }

}