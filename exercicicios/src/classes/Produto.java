package classes;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//declarei de forma explicita o construtor padrão
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(){
		
	}
	
	double precoComDesconto() {
		return preco * ( 1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
