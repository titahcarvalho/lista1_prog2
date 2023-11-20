package prog2_lista1;

public class Calculadora {
	
	public Calculadora() { //construtor
		
	}
	
	public int somar( int a, int b) {
		return a + b;
	}
	public int subtrair( int a, int b) {
		return a - b;
	}
	public int multiplicar( int a, int b) {
		return a * b;
	}
	public double dividir(int a, int b) {
		if (b != 0) {
			return a/b;
		} else {
			System.out.println("Não há divisão por zero!");
		} return a/b;
	}

}
