package classe;

public class DataTeste {

    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 20;
        d1.mes = 11;
        d1.ano = 2022;
        
        var d2 = new Data();
        d2.dia = 2;
        d2.mes = 10;
        d2.ano = 2002;
        
        System.out.printf("Hoje eh %s.\n", d1.obterDataFormatada());
        System.out.printf("Nasci em %s.\n", d2.obterDataFormatada());
    }
}
