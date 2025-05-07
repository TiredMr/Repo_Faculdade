package Conta;

public final class Conta {
    private  String nome;
    private  double saldo;
    private  int numConta;   

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Conta(){
        this("",0, 1000);
    }

    public Conta(String nom, double sal, int num){
        
        this.setNome(nom);
        this.setSaldo(sal);
        this.setNumConta(num);
    }

    public Conta (Conta nova){
        this(nova.getNome(), nova.getSaldo(), nova.getNumConta());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String mostrarDados(){
        String retorno = "Nome: " + this.getNome() + " Saldo: " + getSaldo();
        return retorno;
    }
}
