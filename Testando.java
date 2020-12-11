import java.util.*;
public class Testando extends Carrinho
{
    double totalCompra;
    
    
    
        public static void main(String[] args){
           
            
            Carrinho carrinho = new Carrinho();
            
            Computador comp = new Computador("Acer Nitro 5",1500,"1tb","8g ram","i5 - 9950mhz");
            Cerveja cerva = new Cerveja("Brahma Duplo Malte",3.50,24.47,"11/12/2020");
            
            Pedido pedido1 = new Pedido(comp,2);
            carrinho.addPedido(pedido1);
            
            Pedido pedido2 = new Pedido(cerva,20);
            carrinho.addPedido(pedido2);
            
          
            
            for(Pedido p: carrinho.listaPedidos()){
                System.out.println("Produto: " + p.produto.nome);
                System.out.println("Valor: " + p.produto.valor);
                
                
                for(String item: comp.listaComputador()){
                    System.out.println("Item computador: " + item);
                    System.out.println("\n");
                }
                
                for(String item: cerva.listaCerveja()){
                    System.out.println("Item cerveja: " + item);
                    
                }
                
        }
        
        
        
        
                
        System.out.println("Total da compra: " + carrinho.totalCarrinho() + "\n");
        
    }
}