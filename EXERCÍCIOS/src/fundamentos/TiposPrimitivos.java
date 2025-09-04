package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações Funcionários
		
		// Tipos Numéricos Inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134__845_223L;
		
		// Tipos Numéricos Reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		
		boolean estaDeFerias  = false; // True
		
		// Tipo Caractere
		
		char status = 'A'; // Ativo
		
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		
		// Números de Viagens
		System.out.println(numeroDeVoos / 2);
		
		
		// Pontos Por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status " + status);
		
	}

}
