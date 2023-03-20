package controle;

public class DesafioIf {
    public static void main(String[] args) {
        double nota = 1.3;
        
        // O sistema abaixo executa pois o ; finaliza o nosso IF
        // Não devemos usar ; após uma estrutura condicional, raro em algumas exceções
        
        if(nota >= 9); {
            System.out.println("O aluno foi aprovado!");
        }
    }
}
