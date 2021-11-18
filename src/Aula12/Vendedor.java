package Aula12;

public class Vendedor extends Funcionario{
    private double salario;
    private double comissao;

    public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula,double salario, double comissao) {
        super(nome, sobrenome, cpf, email, matricula);
    }

    @Override
    public void pagamento(){
        System.out.println("o seu salario será de "+ (salario + comissao));
    }
}
