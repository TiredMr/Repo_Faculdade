package Principal;
import Dados.Conta;
import java.util.Scanner;


public class Inicio {
    public static void main(String[] args) {
        String n;
        double s;
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Conta con = new Conta();

        while (opcao !=4){

            System.out.println("Digite a Opção desejada");
            System.out.println("1 - Cadrastar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");

            opcao = scan.nextInt();
            switch(opcao){
                case 1 -> {
                    clearScreen();
                    System.out.println("Digite seu nome:");
                    Scanner scan2 = new Scanner(System.in);
                    n = scan2.nextLine();
                    con.setNome(n);
                    clearScreen();
                }
                case 2 -> {
                    clearScreen();
                    System.out.println("Digite o valor que queira depositar");
                    Scanner scan3 = new Scanner(System.in);
                    s = scan3.nextDouble();
                    con.setSaldo(s);
                    clearScreen();
                }
                case 3 -> {
                    clearScreen();
                    System.out.println(con.getNome());
                    System.out.println(con.getSaldo());
                    System.err.println("Aperte enter para voltar...");
                    Scanner scan4 = new Scanner(System.in);
                    scan4.nextLine();
                    clearScreen();
                }
                case 4 -> {
                    clearScreen();
                    System.out.println("Saindo...");
                    clearScreen();
                    }
                  
                default -> System.out.println("Opção Invalida.");
            } 

        }
      
    }
    
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();
    }  
        
}



