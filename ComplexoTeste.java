package prog2_lista1;

public class ComplexoTeste {

	public static void main(String[] args) {
			//questão A		//2 = real 3 = imaginario
		Complexo a = new Complexo (2,3);
		Complexo a1 = new Complexo (7,1);
		
		a.somarComplexo(a1);
		System.out.println("Resultado:" + a.toString());
		
		Complexo b = new Complexo (5,4);
		Complexo b1= new Complexo (2,2);
		
		b.multiplicarComplexo(b1);
		System.out.println("Resultado:" + b.toString());
		
		Complexo c = new Complexo (3,1);
		Complexo c1= new Complexo (4,2);
		
		c.dividirComplexo(c1);
		System.out.println("Resultado:" + c.toString());
		
		
	}

}
