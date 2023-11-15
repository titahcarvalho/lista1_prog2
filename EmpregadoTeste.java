package prog2_lista1;
import java.util.Date;  //não consegui usar o Calendar
public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregados testeEmpregado1 = new Empregados ("Maria","Silva", new Date(),1500.0);
		Empregados testeEmpregado2 = new Empregados ("João","Souza", new Date(),2500.0);
				
		
		System.out.println("Nome: " + testeEmpregado1.getPrimeiroNome());
		System.out.println("Sobrenome: " + testeEmpregado1.getSobrenome());
		System.out.println("Data de início: " + testeEmpregado1.getDataInicio());
		System.out.println("Salário mensal: R$" + testeEmpregado1.getSalarioMensal());
		System.out.println("Salário Anual: R$" + testeEmpregado1.salarioAnual());
		testeEmpregado1.salarioNovoAumento();
		System.out.println("Reajuste salárial: R$" + testeEmpregado1.salarioAnual());
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Nome: " + testeEmpregado2.getPrimeiroNome());
		System.out.println("Sobrenome: " + testeEmpregado2.getSobrenome());
		System.out.println("Data de início: " + testeEmpregado2.getDataInicio());
		System.out.println("Salário mensal: R$" + testeEmpregado2.getSalarioMensal());
		System.out.println("Salário Anual: R$" + testeEmpregado2.salarioAnual());
		testeEmpregado2.salarioNovoAumento();
		System.out.println("Reajuste salárial: R$" + testeEmpregado2.salarioAnual());


	}

}
