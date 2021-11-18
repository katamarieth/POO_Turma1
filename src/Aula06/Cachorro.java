package Aula06;

import java.time.LocalDate;

public class Cachorro {
    private String nome;
    private String raca;
    private double peso;
    private int anoNascimento;
    private boolean temChip;
    private boolean estaFerido;
    private boolean aptoParaAdocao;
    private int idade;
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean isTemChip() {
        return temChip;
    }

    public void setTemChip(boolean temChip) {
        this.temChip = temChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public boolean isAptoParaAdocao() {
        return aptoParaAdocao;
    }

    public void setAptoParaAdocao(boolean aptoParaAdocao) {
        this.aptoParaAdocao = aptoParaAdocao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                ", anoNascimento=" + anoNascimento +
                ", temChip=" + temChip +
                ", estaFerido=" + estaFerido +
                ", aptoParaAdocao=" + aptoParaAdocao +
                ", idade=" + idade +
                '}';
    }

    //construtor
    public Cachorro(String nome, String raca, double peso,int anoNascimento, boolean temChip, boolean estaFerido) {
        // inicializar
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.anoNascimento = anoNascimento;
        this.temChip = temChip;
        this.estaFerido = estaFerido;
        // metodo
        idade = LocalDate.now().getYear() - anoNascimento;
        aptoParaAdocao = !estaFerido && peso > 5;







    }

}
