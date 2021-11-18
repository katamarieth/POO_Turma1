package Mesa02;

public class Nave extends Objeto{
    private double velocidade;
    private  int vida;

    public Nave(int posx, int posy, char direcao, double velocidade){
        super(posx,posy,direcao);
        this.velocidade = velocidade;
        this.vida = 5;
    }

    @Override
    public void irA(int x, int y, char direcao){
        System.out.println( "posiçãoX: " + x + "\n" +
                "posiçãoY: " + y + "\n" +
                "direção: " + direcao + "\n"
                + "nova posição: " + y + x );
    }
    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public int restaVida(int valor){
        return this.vida - valor;

    }
}


