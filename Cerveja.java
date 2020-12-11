import java.util.*;
public class Cerveja extends Produto
{
  double teorAlcoolico;
  String prazoValidade;
  
  Cerveja(String nome, double valor, double teor, String prazoValidade){
      super(nome, valor);
      this.teorAlcoolico = teor;
      this.prazoValidade = prazoValidade;
  }
 
  public List<String> listaCerveja(){
      List<String> item = new ArrayList();
      item.add(prazoValidade);
      item.add(String.valueOf(teorAlcoolico));
      return item;
  }
}
