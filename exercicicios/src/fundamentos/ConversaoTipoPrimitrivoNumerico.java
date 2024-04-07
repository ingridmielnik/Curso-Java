package fundamentos;

public class ConversaoTipoPrimitrivoNumerico {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		float b = (float)1.0; //conversao explicita -> lê como double
		
		int c = 428;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int)e;
		System.out.println(f);
	 }
}
