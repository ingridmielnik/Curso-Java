package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//conversão número para string
		Integer num1 = 1000;
		System.out.println(num1.toString().length());	
		
		int num2 = 1000;
		System.out.println(Integer.toString(num2).length());	
		
		System.out.println(Integer.toString(num2).length());	

		System.out.println(("" + num2).length());	
		
		//conversão string para número
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		
		System.out.println("Soma " + soma);
		System.out.println("Média " + soma/2);


	}
}
