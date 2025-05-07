package conta;

import cliente.Pessoa;

public class Conta {
    private float saldo;
    private Pessoa titular;
    private int numConta;
    private int tipoConta;


    public int getNumConta() {
     return numConta;
     }
    public void setNumConta(int numConta) {
     this.numConta = numConta;
     }
    public int getTipoConta() {
     return tipoConta;
     }
    public void setTipoConta(int tipoConta) {
     this.tipoConta = tipoConta;
     }
    public Pessoa getTitular() {
     return titular;
     }
    public void setTitular(Pessoa titular) {
     this.titular = titular;
     }
    }
