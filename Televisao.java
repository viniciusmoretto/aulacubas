import java.util.*;
public class Televisao extends Produto{
  double peso;
  double tamanho;
  double resolucao;
  
  Televisao(String nome, double valor, double peso, double tamanho, double resolucao){
      super(nome, valor);
      this.peso = peso;
      this.tamanho = tamanho;
      this.resolucao = resolucao;
  }
}
