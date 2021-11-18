package Aula05;

public class Cliente {
    //Atributos
    private int numeroCliente;
    private String nome;
    private double divida;

    //construtor
    public Cliente(int numero,String nome){
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
    }
    // setters e getters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    //logica
    public void aumentarDivida(double valor){
        this.divida += valor;
        System.out.println("Sua divida agorá é de: " +this.divida);
    }

    public void pagarDivida(double valor){
        if (this.divida == 0){
            System.out.println(("Você não tem divida!!"));
        }else{
            this.divida -=valor;
        }
    }
}
