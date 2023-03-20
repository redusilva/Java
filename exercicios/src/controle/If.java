package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua média: ");
        double media = entrada.nextDouble();
        System.out.print("\n");

        if (media >= 6 && media <= 10) {
            System.out.println("Parabéns! Você foi aprovado!");
        }

        if (media >= 4 && media < 6) {
            System.out.println("Você está de recuperação!");
        }

        if (media >= 0 && media < 4) {
            System.out.println("Você está reprovado!");
        }

        entrada.close();
    }
}
