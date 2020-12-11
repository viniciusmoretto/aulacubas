import java.util.*;

public class Carrinho
{
    private List<Pedido> pedido = new ArrayList();
    
    public void addPedido(Pedido pedidos){
        pedido.add(pedidos);
    }
    
    public double totalCarrinho(){
        double total = 0;
        
        for(Pedido p: pedido){
            double valorTotalPedido = p.produto.valor * p.quantidade;
            total += valorTotalPedido;

        }
    
        return total;
    }
    
    public List<Pedido> listaPedidos(){
        return pedido;
    }
}
