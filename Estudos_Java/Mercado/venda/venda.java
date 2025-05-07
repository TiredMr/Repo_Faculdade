package Mercado.venda;
import java.util.ArrayList;
import java.util.List;


class Produto {
    String nome;
    double valorUnitario;
    int quantidade;

    void Produto(String nome, double valorUnitario, int quantidade){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
}

public class venda {
    private static List<Produto> produtos;
            public venda(){
                produtos = new ArrayList<>();
        }
            public static void adicionarProduto(Produto produto){
                    produtos.add(produto);
            }
            public double calcularTotal(){
                double total = 0;
                for (Produto produto : produtos){
                    total += produto.valorUnitario * produto.quantidade;
                }
                if (total >=500 || total < 1000){
                    total = total * 0.05;
                } else if (total >=1000 || total < 2000){
                    total = total * 0.10;
                } else if (total >= 2000){
                    total = total * 0.15;
                } 
                return total;
            }
            
            

}
