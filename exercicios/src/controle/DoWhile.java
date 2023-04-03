package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String valor = "";

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Deseja sair do loop? ");
            valor = entrada.nextLine();
        } while(!valor.equalsIgnoreCase("sim"));

        System.out.println("Você saiu do loop");

        entrada.close();
    }
}
