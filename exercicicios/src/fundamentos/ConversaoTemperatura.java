package fundamentos;

public class ConversaoTemperatura {
	//método main é ponto de entrada no programa
public static void main(String[] args) {
	double fahrenheit = 86;
	final double AJUSTE = 32.0;
	final double FATOR = 5.0/9.0;
	
	double celsius = (fahrenheit - AJUSTE)*FATOR;
	
	System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");
}
}
