package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
//		declaramos uma variável informando o tipo, nome e valor
		double raio = 3;
//		declaramos uma constante colocando final antes do tipo
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("A area sera " + area + " metros quadrados!");
	}
}
