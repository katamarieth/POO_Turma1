package Aula03;

import java.util.Scanner;

public class Cachorrinhos {
    public static void quantosPacotes(float quantidade){
           Scanner entrada = new Scanner(System.in);
           float kilo = 0.0f;
           int pacote = 0;

           while (kilo < quantidade){
               System.out.println("Digite o peso do pacote: ");
               String entradaAux = entrada.nextLine();
               float aux = Float.parseFloat(entradaAux);
               kilo = kilo + aux;
               pacote = pacote + 1;
           }
        System.out.println("Voce vai precisar de " + pacote + "pacote(s)");
    }

    //main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do cachorro: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a quantidade de ração:");
        String quantAux = entrada.nextLine();
        float quantidade = Float.parseFloat(quantAux);

        quantosPacotes(quantidade);
    }
}
