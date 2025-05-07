package Dados;

public final class Conta {
    private  String nome;
    private  double saldo;   

    public Conta(){
        this("",0);
    }

    public Conta(String nom, double sal){
        
        this.setNome(nom);
        this.setSaldo(sal);
    }

    public Conta (Conta nova){
        this(nova.getNome(), nova.getSaldo());
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
