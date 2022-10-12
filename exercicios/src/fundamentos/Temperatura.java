package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//		fórmula: (°F - 32) * (5/9)= °C
		
		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		int tempFarenheit = -40;		
		double tempCelsius = (tempFarenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura: " + tempCelsius + "C");
	}
}
