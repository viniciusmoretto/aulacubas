import java.util.*;
public class Testando extends Carrinho
{
    double totalCompra;
    
    
    
        public static void main(String[] args){
            
            
            Carrinho carrinho = new Carrinho();
            
            Pedido pedido1 = new Pedido(new Computador("Acer Nitro 5",1500,"1tb","8g ram","i5 - 9950mhz"),2);
            carrinho.addPedido(pedido1);
            
            Pedido pedido2 = new Pedido(new Cerveja("Brahma Duplo Malte",3.50,24.47,"11/12/2020"),25);
            carrinho.addPedido(pedido2);
            
          
            
            for(Pedido p: carrinho.listaPedidos()){
                System.out.println("Produto: " + p.produto.nome);
                System.out.println("Valor: " + p.produto.valor);
                
                for(String item: Computador.listaComputador()){
                    System.out.println("Item computador: " + item);
                    System.out.println("\n");
                    contador++;
                }
                
                for(String item: pedido2.produto.listaCerveja()){
                    System.out.println("Item cerveja: " + item);
                    contador++;
                }
                
        }
        
        
        
        
                
        System.out.println("Total da compra: " + carrinho.totalCarrinho() + "\n");
        
    }
}