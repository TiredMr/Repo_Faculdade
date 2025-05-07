import java.util.Scanner;
import Venda.java;
public class Caixa {
    public static void main(String[] args) {
                Scanner tecla = new Scanner(System.in);
                Produto prod = new Produto();
                Venda ven = new Venda();
                
                int opcao = 0;
                double v = 0;
                int q = 0;
                String n;

        
                while (opcao != 4){
        
                    System.out.println("1 - Cadrastar Produto");
                    System.out.println("2 - Selecionar Produtos para comprar");
                    System.out.println("3 - Mostrar carrinho");
                    System.out.println("4 - Pagar");
                    System.err.println("5 - Saindo...");
        
                    opcao = tecla.nextInt();
        
                    switch (opcao) {
                        case 1 -> { 
                        
                        System.out.println("Digite seu nome:");
                        n = tecla.nextLine();
                        System.out.println("Digite seu nome:");
                        v = tecla.nextDouble();
                        System.out.println("Digite seu nome:");
                        q = tecla.nextInt();
                        
                        prod.Produto(n, v, q);
                        
                        }
        
                        case 2 -> { adicionarProduto(prod);

                        }
                
                        case 3 -> { System.out.println("Seu carrinho" + prod);

                        }

                        case 4 -> {

                        }

                        case 5 -> {

                        }
                        default -> { System.out.println("Saindo...");
                        }
                    
                    }



                }

        
            }
}
