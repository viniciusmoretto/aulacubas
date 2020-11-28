public class Computador extends Produto{

    private String hd;
    private String memoria;
    private String processador;

    public Computador(String fabricante, String nome, double preco, String hd, String memoria, String processador){

        super(fabricante,nome,preco);
        this.hd = hd;
        this.memoria = memoria;
        this.processador = processador;

    }


    public String getHd(){

        return this.hd;

    }

    public String getMemoria(){

        return this.memoria;

    }

    public String getProcessador(){

        return this.processador;

    }

}