package Cliente;
import java.util.Scanner;

public class Endereco {
    private String Rua;
    private String Bairro;
    private int NumCasa;
    private String Cidade;
    private String UF;

    public void Cadrasta(){
        @SuppressWarnings("resource")
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu Estado");
        UF = tec.nextLine();
        System.out.println("Digite sua Cidade");
        Cidade = tec.nextLine();
        System.out.println("Digite seu Bairro");
        Bairro = tec.nextLine();
        System.out.println("Digite sua Rua");
        Rua = tec.nextLine();
        System.out.println("Digite o Numero da casa");
        NumCasa = tec.nextInt();

    }
    public String getCidade(){
        return Cidade;
    }
    public void setCidade(String cidade){
        Cidade = cidade;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String uF) {
        UF = uF;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }

    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public int getNumCasa() {
        return NumCasa;
    }
    public void setNumCasa(int numCasa) {
        NumCasa = numCasa;

    }
   
}