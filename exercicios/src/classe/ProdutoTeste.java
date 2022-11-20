package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4525.78;
        p1.desconto = 0.25;
        
        Produto p2 = new Produto();
        p2.nome = "Caneta Azul";
        p2.preco = 1;
        p2.desconto = 0.3;
        
        double precoP1 = p1.preco * (1 - p1.desconto);
        double precoP2 = p2.preco * (1 - p2.desconto);
        System.out.printf("Preço P1: R$%.2f\n", precoP1);
        System.out.printf("Preço P2: R$%.2f\n", precoP2);
    }
}
