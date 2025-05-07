package Vendas;
import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
                Scanner tecla = new Scanner(System.in);
                Venda ven = new Venda();
                Produto prod = new Produto();
                Produto prod2 = new Produto();
                
                int opcao = 0;
                double v = 0;
                int q = 0;
                

        
                while (opcao != 4){
        
                    System.out.println("1 - Cadastar Produto");
                    System.out.println("2 - Selecionar Produtos para comprar");
                    System.out.println("3 - Mostrar carrinho");
                    System.out.println("4 - Pagar");
                    System.out.println("5 - Saindo...");
        
                    opcao = tecla.nextInt();
        
                    switch (opcao) {
                        case 1 -> {
                            Scanner scan = new Scanner(System.in);
                            System.out.println("Digite o nome:");
                            String n = scan.nextLine();
                            

                            System.out.println("Digite o valor:");
                            v = scan.nextDouble();
                            
                            System.out.println("Digite a quantidade:");
                            q = scan.nextInt();
                        
                            prod.Produto(n, v, q);

                            // Scanner scan2 = new Scanner(System.in);
                            // System.out.println("Digite o nome:");
                            // String n1 = scan2.nextLine();
                            

                            // System.out.println("Digite o valor:");
                            // double v1 = scan2.nextDouble();
                            
                            // System.out.println("Digite a quantidade:");
                            // int q1 = scan2.nextInt();

                            // prod2.Produto(n1, v1, q1);
                        
                        
                        } 
        
                        case 2 -> { Venda.produtos.add(prod);
                        }
                
                        case 3 -> { for (Produto produto : Venda.produtos){
                            System.out.println(produto);
                        };

                        }

                        case 4 -> {
                            double total = ven.calcularTotal();
                            System.out.println("Total foi de " +total);


                        }

                        case 5 -> {

                        }
                        default -> { System.out.println("Saindo...");
                        }
                    
                    }



                }

        
            }
}

