package Mesa02;

public class Objeto {
    //atributos
    private  int posx;
    private int posy;
    private  char direcao;

    //construtor

    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

  public void irA(int posx, int posy, char direcao) {
      this.posx = posx;
      this.posy = posy;
      this.direcao = direcao;
  }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public char getDirecao() {
        return direcao;
    }
}
