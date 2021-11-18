package Mesa02;

public class Principal {
    public static void main(String[] args) {
        Nave nave = new Nave(20,10,'N',30.2);
        System.out.println(nave);
        nave.irA(2,10,'N');
        System.out.println(nave.equals(nave));

        Nave naveInimiga = new Nave(10,16,'S',26.2);
        System.out.println(naveInimiga);
        System.out.println(nave.equals(naveInimiga));
        naveInimiga.girar('N');
        naveInimiga.restaVida(2);
        System.out.println(naveInimiga);

        Asteroide asteroide = new Asteroide(15,5,'O',30);
        System.out.println(asteroide);
        System.out.println(asteroide.hashCode());

    }
}
