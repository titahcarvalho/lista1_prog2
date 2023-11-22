package prog2_lista1;
import java.util.Scanner;
public class CalculadoraTeste {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner entrada = new Scanner(System.in);
		Calculadora calcular = new Calculadora();
		
		System.out.println("Digite o primeiro numero:");
		a = entrada.nextInt();
		

		System.out.println("Digite o segundo numero:");
		b = entrada.nextInt();
		
		
		System.out.println("Divisão: " + calcular.dividir(a, b));
		System.out.println("Subtração: " + calcular.subtrair(a,b));
		System.out.println("Soma: " + calcular.somar(a,b));
		System.out.println("Multiplicação: " + calcular.multiplicar(a,b));
		
		entrada.close();
	}

}
