package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4525.78, 0.25);
        
        Produto p2 = new Produto();
        p2.nome = "Caneta Azul";
        p2.preco = 1;
        p2.desconto = 0.3;
        
        double precoP1 = p1.precoComDesconto();
        double precoP2 = p2.precoComDesconto();
        
        System.out.printf("Preço P1: R$%.2f\n", precoP1);
        System.out.printf("Preço P2: R$%.2f\n", precoP2);
        
        double preco1 = p1.precoComDesconto(0.5);
        double preco2 = p2.precoComDesconto(0.2);
        
        System.out.printf("Preço P1: R$%.2f\n", preco1);
        System.out.printf("Preço P2: R$%.2f\n", preco2);
    }
}
