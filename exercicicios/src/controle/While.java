package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int contador = 1;
		while(contador <= 3) {
			System.out.printf("i = %d\n", contador);
			contador ++;
		}
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
