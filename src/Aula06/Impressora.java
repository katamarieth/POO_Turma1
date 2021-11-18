package Aula06;

import java.time.LocalDate;


public class Impressora {
    //atributos
    private  String modelo;
    private  String tipoConexao;
    private LocalDate dataFabricacao ;
    private int folhasDisponiveis;

    //construtor
    public Impressora (String modelo, String tipoConexao,LocalDate dataFabricacao){
        //inicializar as variaveis
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }
    //metodo
    private boolean temPapel() {
        if(this.folhasDisponiveis > 0){
            return true;
        }else{
            return false;
        }
    }

    public void imprimir(String texto) {
        if(temPapel()){
            System.out.println(texto);
            this.folhasDisponiveis --;
        }else {
            System.out.println("Não tem papel!!");
        }
    }
    //setters e getters


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }
}
