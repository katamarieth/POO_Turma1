package Aula11Mesa;

public class Principal {

    public static void main (String[]args){

        Cachorro cachorro = new Cachorro("dorado",5);
        Cavalo cavalo = new Cavalo ("pony",10);
        Preguica preguica = new Preguica("soninho",10);

        cachorro.emitirSom();
        cavalo.emitirSom();
    }
}
