package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        // não quebra linha 
        System.out.print("Bom");
        System.out.print(" dia!\n\n");
        
        // quebra linha no final do print 
        System.out.println("Bom");
        System.out.println("dia!");
        
        // imprime uma string formatada mas não quebra linha
        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "João");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        entrada.close();
        
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
    }
}
