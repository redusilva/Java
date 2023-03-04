package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        // Retorna verdadeiro
        System.out.println("2"=="2");
        
        // Retorna falso
        String s1 = new String("2");
        System.out.println("2"==s1);
        
        // Retorna verdadeiro
        System.out.println("2".equals(s1));
        
        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.next();
        
        // Retorna falso
        System.out.println(s1==s2);
        entrada.close();
        
        // Retorna verdadeiro
        System.out.println(s2.equals(s1));
    }
}
