package animal;

public class Preguica extends animal{

    public Preguica(String nome, int id ){
    super.setNome(nome);
    super.setIdade(id);
 }

    @Override
    public void seLocomove() {
    System.out.println("Preguiça: "+super.getNome());
    System.out.println("Idade: "+super.getIdade());
    System.out.println("Subindo na Árvore");
 }

    @Override
    public void emiteSom() {
    System.out.println("GRRRRRRRrrrrrr");
    }
}