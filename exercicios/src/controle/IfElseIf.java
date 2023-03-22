package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");

        double nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        } else if (nota < 4) {
            System.out.println("Aluno reprovado!");
        } else if (nota >= 4 && nota <= 6) {
            System.out.println("Aluno está em recuperação!");
        } else if (nota > 6) {
            System.out.println("Parabéns! O aluno foi aprovado!");
        }
        
        entrada.close();
    }
}
