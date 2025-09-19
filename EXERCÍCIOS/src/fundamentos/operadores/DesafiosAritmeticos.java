package fundamentos.operadores;


public class DesafiosAritmeticos {
	
		public static void main(String[] args) {
		
int a = 6;
int b = 3;
int c = 2;
int d = 1;
int e = 5;
int f = 2;
int g = 7;
int h = 10;

// Parte 1 do numerador: [6 * (3 + 2)]^2 / (3 * 2)
int parte1Numerador = a * (b + c);
int parte1NumeradorElevado = (int) Math.pow(parte1Numerador, c);
int parte1Denominador = b * c;
int parte1Resultado = parte1NumeradorElevado / parte1Denominador;

// Parte 2 do numerador: ((1 - 5) * (2 - 7) / 2)^2
int parte2Numerador = (d - e) * (f - g);
int parte2Resultado = (int) Math.pow((parte2Numerador / f), c);

// Resultado do numerador antes da potência 3
int resultadoNumeradorBase = parte1Resultado - parte2Resultado;

// Elevando o resultado do numerador à potência de 3
int resultadoNumeradorFinal = (int) Math.pow(resultadoNumeradorBase, b);

// Denominador final: 10^3
int denominadorFinal = (int) Math.pow(h, b);

// Resultado final da expressão
int resultadoFinal = resultadoNumeradorFinal / denominadorFinal;

System.out.println("Resultado do numerador: " + resultadoNumeradorFinal);
System.out.println("Resultado do denominador: " + denominadorFinal);
System.out.println("Resultado final: " + resultadoFinal);


		};
		
};