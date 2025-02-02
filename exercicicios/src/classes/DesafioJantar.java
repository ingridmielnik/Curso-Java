package classes;

public class DesafioJantar {

	public static void main(String[] args) {
		DesafioComida c1 = new DesafioComida("Arroz", 0.223);
		DesafioComida c2 = new DesafioComida("Feijão", 0.300);
		DesafioPessoa p = new DesafioPessoa("João", 99.8);

		System.out.println(p.apresentar());
		
		p.comer(c1);
		System.out.println(p.apresentar());
		
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
