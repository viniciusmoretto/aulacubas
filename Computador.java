import java.util.*;
public class Computador extends Produto
{
  String hd;
  String memoria;
  String processador;
 
  
  Computador(String nome, double valor, String hd, String memoria, String processador)
  {
    super(nome, valor);
    this.hd = hd;
    this.memoria = memoria;
    this.processador = processador;
  }
  
  public List<String> listaComputador(){
      List<String> item = new ArrayList();
      item.add(hd);
      item.add(memoria);
      item.add(processador);
      return item;
  }
  
  public String getHd(){
      return this.hd;
  }
}

