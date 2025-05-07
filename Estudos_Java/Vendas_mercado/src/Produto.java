import java.util.Scanner;

public final class Produto {
    String nome;
    double valorUnitario;
    int quantidade;

    public Produto(String nome, double valorUnitario, int quantidade) {
        this.setNome(nome);
        this.setValorUnitario(valorUnitario);
        this.setQuantidade(quantidade);
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void Cadrasta(){
        @SuppressWarnings("resource")
        Scanner tec = new Scanner(System.in);
        System.out.println("Digie o nome do Produto");
        nome = tec.nextLine();
        System.out.println("Digite seu preço");
        valorUnitario = tec.nextInt();
    } 
}