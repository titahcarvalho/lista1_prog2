package prog2_lista1;

public class Complexo {
	private int real;
	private int imaginario;
	
	public Complexo ( int real, int imaginario) {
		this.imaginario =imaginario;
		this.real = real;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginario() {
		return imaginario;
	}

	public void setImaginario(int imaginario) {
		this.imaginario = imaginario;
	}
	public void somarComplexo (Complexo numero) {
		real += numero.getReal();
		imaginario += numero.getImaginario();
			
	}
	public void multiplicarComplexo (Complexo numero) {
		real = ((real * numero.getReal()) + (real*numero.getImaginario()));
		imaginario =((imaginario * numero.getImaginario()) + (real*numero.getImaginario()));
			
	}
	public void dividirComplexo (Complexo numero) {
		real = real / numero.getReal();
		imaginario = imaginario / numero.getImaginario();//tá errada essa parte =]
			
	}
	public String toString () {
		return real + "+" + imaginario + "i";
	}
}

