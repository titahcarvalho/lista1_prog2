package prog2_lista1;

public class DataTeste {

	public static void main(String[] args) {
				
		
		Datas teste = new Datas(16,11,2023);
		System.out.println("Por parametros: " + teste);	
		
		Datas teste1 = new Datas(3,12,2023);
		System.out.println("Por parametros: " + teste1);	
		
		
		
		//a partir daqui não acontece a validação devido o metodo validarData estar no construtor com parametros. //vou tentar colocar no outro construtor		
		Datas testeOutra = new Datas();
		testeOutra.setAno(2023); 
		testeOutra.setMes(11);
		testeOutra.setDia(20);
		System.out.println("Sem parametros e data do sistema operacional: " + testeOutra); 
		
		teste.avancarDia(1); //avança a data em um dia.
		testeOutra.avancarDia(1);
		System.out.println("Dia seguinte: " + teste);
		System.out.println("Dia seguinte: " + testeOutra);
		

	}

}
