package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {
        double media = 6.6;
        String situacao = media >= 6 ? "aprovado" : "reprovado";
        
        System.out.printf("O aluno está %s.\n\n", situacao);
        
        double nota = 8.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim" : "Não";
        System.out.printf("Tem direito ao desconto? %s.", resultado);
    }
}
