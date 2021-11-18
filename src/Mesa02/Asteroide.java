package Mesa02;

public class Asteroide extends Objeto {
    private  int danos;

    public Asteroide(int posx, int posy, char direcao, int danos) {
        super(posx, posy, direcao);
        this.danos = danos;
    }

    @Override
  public void irA( int x, int y, char direcao){
        System.out.println( "posiçãoX: " + x + "\n"+
                "posiçãoY: " + y + "\n" +
                "direção: " + direcao + "\n"
                + "nova posição: " + y + x);
    }

    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }
}
