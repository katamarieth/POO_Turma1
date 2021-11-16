package Aula11Mesa;

import java.security.spec.RSAOtherPrimeInfo;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Relinchar");
    }
    @Override
    public void correr(){
        System.out.println("Correr tipo cavalo");
    }
}
