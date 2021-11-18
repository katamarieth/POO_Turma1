package RevisaoDos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        System.out.println("Digite seu nome: ");
        String nomeAluno = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int suaIdade = entrada.nextInt();
        System.out.println("Digite seu peso: ");
        double pesoAluno = entrada.nextDouble();
        System.out.println("Digite sua altura: ");
        double alturaAluno = entrada.nextDouble();

        Imc aluno = new Imc(nomeAluno,suaIdade,pesoAluno,alturaAluno);

        aluno.calcularImc();
    }
}
