package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o salario desse mes: R$");
        String salario1 = entrada.nextLine();
        System.out.print("Digite o salario do mes passado: R$");
        String salario2 = entrada.nextLine();
        System.out.print("Digite o salario do mes retrasado: R$");
        String salario3 = entrada.nextLine();
        entrada.close();
        
        salario1 = salario1.replace(",", ".");
        salario2 = salario2.replace(",", ".");
        salario3 = salario3.replace(",", ".");
        
        double soma = Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3);
        double media = soma / 3;
        
        System.out.printf(
                  "Voce recebeu R$%s nesse mes.\n" +
                  "Voce recebeu R$%s no mes passado.\n" +
                  "Voce recebeu R$%s no mes retrasado.\n" +
                  "A media desses salarios eh %.2f",
                  salario1, salario2, salario3, media
        );
        
    }
}
