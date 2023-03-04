package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        //  / * - +
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("\nDigite um valor: ");
        double num2 = entrada.nextDouble();
        
        System.out.print("\nDigite a operacao que deseja fazer: ");
        String operacao = entrada.next();
        
        double resultado = operacao.equals("*") ? (num1 * num2) : operacao.equals("/") ? (num1 / num2) : operacao.equals("+") ? (num1 + num2) : operacao.equals("-") ? (num1 - num2) : 0;     
        
        System.out.printf("\n\nO resultado entre %.2f %s %.2f é igual a %.2f", num1, operacao, num2, resultado);
        
        entrada.close();
    }
}
