package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário
        
        /* Tipos Númericos Inteiros */
        byte anosDeEmpresa = 23;
        short voosRealizados = 542;
        int id = 56789;
        long pontosAcumulados = 3_784_889_931L;
        /* Usamos o L depois do número para informar ao Java que 
        estamos falando de um número do tipo long */
        
        // Tipos Númericos Reais
        float salario = 11_465_646.87F;
        double vendasAcumuladas = 54_789_121_454.89;
        
        // Tipo booleano
        boolean estaDeFerias = false;
        boolean estaTrabalhando = true;
        
        // Tipo caractere
        char status = 'A';
        
        // Dias de Empresa
        System.out.println(anosDeEmpresa * 365);
        
        // Números de Viagem
        System.out.println(voosRealizados / 2);
        
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        
        System.out.println(id + " ganha -> " + salario);
        System.out.println("Está de férias? " + estaDeFerias);
        System.out.println("Está trabalhando? " + estaTrabalhando);
        System.out.println("Status: " + status);
    }
}
