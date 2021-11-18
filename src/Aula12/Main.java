package Aula12;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario= new Gerente("João", "Vitor", "1234",
                "joao@.com", "00123", 2000, 100);
        Empresa dh = new Empresa("dh", "5555");
        dh.addFuncionario(funcionario);

    }
}
