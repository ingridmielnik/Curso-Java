package fundamentos;

public class TiposPrimitivos {
public static void main(String[] args) {
	//Info do funcionario
	
	//Tipos numéricos inteiros
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	int id = 56789;
	//literal longo, quando passo o inteiro, preciso passar o L
	long pontosAcumulados = 3_324_845_223L;
	
	//Tipos numéricos reais
	float salario = 11_445.44F;
	double vendasAcumuladas = 2_991_797_103.01;
	
	//Tipo booleano
	boolean estaDeFerias = false;
	char status = 'A'; //posso usar valores da tabela unicode
	
	//Dias de empresa
	System.out.println(anosDeEmpresa *365);
	
	//Numero de viagens
	System.out.println(numeroDeVoos / 2);

	//Pontos por real
	System.out.println(pontosAcumulados / vendasAcumuladas);
	
	System.out.println(id + ": ganha -> " + salario);
	System.out.println("Férias? " + estaDeFerias);
	System.out.println("Status: " + status);
}
}
