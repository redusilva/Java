package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
//		declaração de variável normal
		double a = 10;
		System.out.println(a);
		
//		inferência de variável
//		você declara uma variável e o java tipo ela a partir do dado inserido
		var b = 10;
		System.out.println(b);
		
//		não podemos fazer b = "texto", por exemplo, pois a linguagem foi tipada como int
//		também não podemos declarar a variável e inicializá-la depois
	}
}
