package animal;
public class Cavalo extends animal {
 public Cavalo(String nome, int id ){
 super.setNome(nome);
 super.setIdade(id);
 }
 @Override
 public void seLocomove() {
 System.out.println("Cavalo: "+super.getNome());
 System.out.println("Idade: "+super.getIdade());
 System.out.println("Cavalga, Marcha, Trota");
 }

//
 @Override
 public void emiteSom() {
 System.out.println("Nhiiiiiiiiiiii ri ri rin !");
 }
}