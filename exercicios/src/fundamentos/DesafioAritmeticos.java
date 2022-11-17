package fundamentos;

public class DesafioAritmeticos {

    public static void main(String[] args) {
        double parte1 = 6 * (3 + 2);
        parte1 = Math.pow(parte1, 2); 
        parte1 = parte1 / (3 * 2);
        
        double parte2 = (1 - 5) * (2 - 7);
        parte2 = parte2 / 2;
        parte2 = Math.pow(parte2, 2);
        
        double numerador = parte1 - parte2;
        numerador = Math.pow(numerador, 3);
        
        double denominador = Math.pow(10, 3);
        
        double resultado = numerador / denominador;
        System.out.println("O resultado eh " + resultado);
    }
}
