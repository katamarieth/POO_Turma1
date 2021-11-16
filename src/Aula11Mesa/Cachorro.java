package Aula11Mesa;

public class  Cachorro extends Animal{

        public Cachorro(String nome, int idade) {
            super(nome, idade);
        }

        @Override
        public void emitirSom(){
            System.out.println("latir");
        }
        @Override
        public void correr(){
            System.out.println("Correr como um cachorro");
        }
    }

