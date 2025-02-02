package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1,1,1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormata() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	} 
	
//	não é recomendado - system só imprime no terminal
	void imprimirDataFormatada() {
		System.out.printf(this.obterDataFormata());
	}
}