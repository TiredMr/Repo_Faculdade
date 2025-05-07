import javax.swing.JOptionPane;

public class Carro {
    private int id;
    private String modelo;
    private double quilometragem;
    private double valorVenda;
    private int desconto;

    public void cadastrarCarro(){
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do carro"));
        this.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        this.quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem do carro"));
        this.valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda do carro"));
        this.desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor do desconto"));

    }

    public void imprimirResumoCarro(){
        String msg = "Id:" + this.id + "\n" + "Modelo: " + this.modelo + "\n" 
        + "Quilometragem: " + this.quilometragem + "\n" + "Valor Venda: " + this.valorVenda;
        System.out.println(msg);
    }

    public double  atualizarValorDesconto(double percentualDesconto){
        this.valorVenda *= (percentualDesconto / 100);
        return this.valorVenda;
    }

    public double getValorVenda(){
        return this.valorVenda;
    }

    public double getDesconto(){
        return this.desconto;
    }
}