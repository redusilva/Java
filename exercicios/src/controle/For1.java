package controle;

public class For1 {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 50; contador++) {
            System.out.println("Contador = " + contador);
        }

        // Outra forma de fazer
        int cont = 1;
        for (; cont <= 10;) {
            System.out.println("Outro contador: " + cont);
            cont++;
        }

        // Laço infinito
        for (;;) {
            System.out.println("Laço infinito");
        }
    }
}
