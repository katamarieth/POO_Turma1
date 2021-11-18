package Aula10;

public class Associado {
    private String numAssociado;
    private String nome;
    private double valorMensal;
    private String Atividade;


    public Associado(String numAssociado, String nome, double valorMensal, String atividade) {
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.Atividade = atividade;
    }
    public double custoMensal(){
        return this.valorMensal;
    }
}
