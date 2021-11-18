package Aula05;

public class UsuarioJogo {
    //atributos
    private String nome;
    private String nickname;
    private int nivel;
    private int pontuacao;

    //construtor
    public UsuarioJogo(String nome, String nickname){
        //inicializar as variaveis
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 0;
    }
    //metodo
    public void aumentarPontuacao(int pontos){
        this.pontuacao += pontos;
        System.out.println("a pontuacao do usuario " +nome +" é de: " + this.pontuacao);
    }
    public void subirNivel(int xp){
        this.nivel += xp;
        System.out.println("Seu nivel é de: " + this.nivel);
    }
    public void bonus(int valor){
        this.pontuacao += valor;
        System.out.println("Sua pontuacao é de: " + this.pontuacao);

        }
        //setters e getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
