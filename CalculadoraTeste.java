package prog2_lista1;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calcular = new Calculadora();
		double resultadoDivisao = calcular.dividir(8, 4);
		int resultadoSubtracao = calcular.subtrair(5, 67);
		int resultadoSoma = calcular.somar(5,7);
		int resultadoMultiplicacao = calcular.multiplicar(8, 34);
		
		System.out.println("Somar: " + resultadoSoma);
		System.out.println("Subtrair: " + resultadoSubtracao);
		System.out.println("Multiplicar: " + resultadoMultiplicacao);
		System.out.println("Dividir: " + resultadoDivisao);
	}

}
