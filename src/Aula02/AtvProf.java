package Aula02;

import java.util.Scanner;

public class AtvProf {
    //iniciamos sando um main
    public static void main(String[] args) {
        //para interagir com o sistema
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String sobrenome = entrada.nextLine();


        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        char inicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);

        System.out.println("Nome: " + nome + "\nSobrenome: "+ sobrenome +
                            "\n Iniciais: " + inicialN + " " + inicialS +
                            "\nData de Nascimento: "+ dia + "/" + mes + "/" + ano);

    }
}
