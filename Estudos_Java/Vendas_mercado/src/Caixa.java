import java.util.Scanner;

public class Caixa {
    
    public static void main(String[] args) {

        Venda ven = new Venda();
        Produto prod = new Produto(null, 0, 0);
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

       while (opcao != 4) {

        System.out.println("Digite a Opção desejada");
            System.out.println("1 - Cadrastar");
            System.out.println("2 - Comprar");
            System.out.println("3 - Ver Produtos");
            System.out.println("4 - Sair");

        opcao = scan.nextInt();

        switch (opcao) {
            case 1 -> prod.Cadrasta();
            
            case 2 -> {
                }
            
            case 3 -> {
                }
            default -> {
                System.out.println("Saindo...");;
                }
        }

          
       }
    }
}
