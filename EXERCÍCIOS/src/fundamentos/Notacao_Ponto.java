package fundamentos;

public class Notacao_Ponto {
	
	public static void main (String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "pg".toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X"
				.replace("X", "pg")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		
		// Tipos Primitivos Não Tem o Operador "."
		int a = 23;
		System.out.println(a);
				
	}

}
