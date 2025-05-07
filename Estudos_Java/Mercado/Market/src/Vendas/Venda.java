package Vendas;

import java.util.ArrayList;
import java.util.List;


class Produto {
    String nome;
    double valorUnitario;
    int quantidade;

    public Produto(String nome, double valorUnitario, int quantidade){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
}

public class Venda {
            static List<Produto> produtos;
            
            public Venda(){
                produtos = new ArrayList<>();
            }
            public double calcularTotal(){
                double total = 0;
                for (Produto produto : produtos){
                    total = produto.valorUnitario * produto.quantidade;
                }
                if (total >=500 || total < 1000){
                    total = total - (total * 0.05);
                } else if (total >=1000 || total < 2000){
                    total = total - (total * 0.10);
                } else if (total >= 2000){
                    total = total - (total * 0.15);
                } 
                return total;
            }
            
            

}

