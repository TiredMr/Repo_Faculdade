
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        double total;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o preco");
        total = scan.nextDouble();

        if (total >=500 || total < 1000){
            total = total + (total * 0.05);
        } else if (total >=1000 || total < 2000){
            total = total + (total * 0.10);
        } else if (total >= 2000){
            total = total + (total * 0.15);
        }

        System.out.println("O total foi de:" +total);

    }
    
}
