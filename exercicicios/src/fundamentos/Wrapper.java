package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		//Integer.parseInt(entrada.next());
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 2);
		System.out.println(l / 3);

		Boolean bo = Boolean.parseBoolean("true"); //converti string p/ bool
		//entrada.close();
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
	}
}
