package animal;

abstract public class animal {
    private String nome;
    private int idade;
    abstract public void seLocomove();
    abstract public void emiteSom();
    public int getIdade() {
    return idade;
    }
    public void setIdade(int idade) {
    this.idade = idade;
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }

    
}


