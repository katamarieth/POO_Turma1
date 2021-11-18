package Aula12;

public class Secretaria extends Funcionario{
    private double salario;

    public Secretaria(String nome, String sobrenome, String cpf, String email, String matricula) {
        super(nome, sobrenome, cpf, email, matricula);
    }
    @Override
    public void pagamento(){
        System.out.println("O seu salario é "+ salario);
    }

}
