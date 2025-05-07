import javax.swing.JOptionPane;

public class Venda {

    private Carro carro;
    private Cliente cliente;

    public void realizarVenda(){
        this.carro = new Carro();
        carro.cadastrarCarro();
        this.cliente = new Cliente();
        cliente.cadastrarCliente();

        double parcela = (this.carro.getValorVenda() - this.carro.atualizarValorDesconto(this.carro.getDesconto())) / 36;

        if (validarVenda(parcela, this.cliente.getRenda())){

            if (validarIdade(this.cliente.getIdade())){ 
                JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
                carro.imprimirResumoCarro();
                System.out.println("" + parcela);
            } else {
                JOptionPane.showMessageDialog(null, "O Cliente NÃO tem idade o sufiente para completar a compra!"); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Venda NÃO realizada!");
        }
    }

    
    public boolean validarVenda(Double valorParcela, double renda){
        boolean resultado = false;
        double valorReferencia = renda - 0.3;
        resultado = valorParcela <= valorReferencia;
        return resultado;
    }

    public boolean validarIdade(int idadeCliente){
        boolean resultado = false;
        int idadeMinima = 18;
        resultado = idadeCliente >= idadeMinima;
        return resultado;

    }
}