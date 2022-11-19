package fundamentos.operadores;

public class Atribuicao {

    public static void main(String[] args) {
        
         int a = 5;
         int b = a;
         int c = a + b;
         
         c += a; // c = c + a
         c -= a; // c = c - a
         c *= a; // c = c * a
         c /= a; // c = c / a
         c %= a; // c = c % a
         c++; // c = c + 1
         
         c%= 2;
         System.out.println(c);
    }
}
