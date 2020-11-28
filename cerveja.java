public class Cerveja extends Produto{

    private double teorAlcool;
    private String prazoValidade;

    public Televisao(String fabricante, String nome, double preco, double teorAlcool, String prazoValidade){

        super(fabricante,nome,preco);
        this.teorAlcool = teorAlcool;
        this.prazoValidade = prazoValidade

    }

    public double getTeorAlcool(){

        return this.teorAlcool;

    }

    public String getPrazoValidade(){

        return this.prazoValidade;

    }

}