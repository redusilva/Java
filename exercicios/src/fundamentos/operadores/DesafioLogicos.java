package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = true;
        
        boolean comprouAlgumaTv = trabalho1 || trabalho2;
        boolean comprouTv50Polegadas = trabalho1 && trabalho2;
        boolean comprouTv32Polegadas = trabalho1 ^ trabalho2;
        boolean tomouSorvete = comprouTv50Polegadas || comprouTv32Polegadas;
        
        System.out.println("Compraram alguma TV? " + comprouAlgumaTv);
        System.out.println("Comprou a Tv de 50 polegadas? " + comprouTv50Polegadas);
        System.out.println("Comprou a Tv de 32 polegadas? " + comprouTv32Polegadas);
        System.out.println("Todos tomaram sorvete? " + tomouSorvete);
        
    }
}
