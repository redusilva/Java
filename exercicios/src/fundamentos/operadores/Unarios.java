package fundamentos.operadores;

public class Unarios {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        
        a++; // a = a + 1
        a--; // a = a - 1
        
//      tem uma ordem de precedência menor que a anterior
        ++b; // b = b + 1
        --b; // b = b - 1
        
        System.out.println("\n\nMini-Desafios:");
        System.out.println(++a == b--);
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
    }
}
