package Aula11Mesa;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de preguiça");
    }
    public  void subirArvole(){
        System.out.println("Subir na arvore");
    }
}
