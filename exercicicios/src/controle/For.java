package controle;

public class For {
	public static void main(String[] args) {
		for(int contador = 1; contador <= 3; contador++) {
			System.out.printf("1° for: i = %d\n", contador);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++ ) {
				System.out.printf("Segundo for: [%d %d] \n", i, j);
			}
		}
	}
	
}
