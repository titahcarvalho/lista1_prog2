package prog2_lista1;
//import java.util.Date;  //não consegui usar o Calendar
public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregados testeEmpregado1 = new Empregados ("Maria","Silva", 12,11,2023/*new Date()*/,1500.0);//...date 12,01,2023,...
		Empregados testeEmpregado2 = new Empregados ("João","Souza", 21,11,2023 /*new Date()*/,2500.0); //...date 01,10,2020,
				
		
		System.out.println("Nome: " + testeEmpregado1.getPrimeiroNome());
		System.out.println("Sobrenome: " + testeEmpregado1.getSobrenome());
		//System.out.println("Data de início: " + testeEmpregado1.getDataInicio());
		System.out.println("Data de início: " + testeEmpregado1.getDia() + "/" + testeEmpregado1.getMes() + "/" + testeEmpregado1.getAno());
		System.out.println("Salário mensal: R$" + testeEmpregado1.getSalarioMensal());
		System.out.println("Salário Anual: R$" + testeEmpregado1.salarioAnual());
		testeEmpregado1.salarioNovoAumento();
		System.out.println("Reajuste salárial: R$" + testeEmpregado1.salarioAnual());
		//testeEmpregado(1.1*testeEmpregado1.getSalario()); //para mudar o salario pelo metodo main
		//sysout testeEmpregado1.getTotal());//para imprimir o numero total de empregados
		System.out.println("----------------------------------------------");
		
		System.out.println("Nome: " + testeEmpregado2.getPrimeiroNome());
		System.out.println("Sobrenome: " + testeEmpregado2.getSobrenome());
		//System.out.println("Data de início: " + testeEmpregado2.getDataInicio());
		System.out.println("Data de início: " + testeEmpregado2.getDia() + "/" + testeEmpregado2.getMes() + "/" + testeEmpregado2.getAno());
		System.out.println("Salário mensal: R$" + testeEmpregado2.getSalarioMensal());
		System.out.println("Salário Anual: R$" + testeEmpregado2.salarioAnual());
		testeEmpregado2.salarioNovoAumento();
		System.out.println("Novo salário mensal: R$" + testeEmpregado2.getSalarioMensal());
		System.out.println("Reajuste salárial: R$" + testeEmpregado2.salarioAnual());
		System.out.println("Total de funcionarios: " + testeEmpregado1.getTotal());
 		
		//na prova possa ser que ela peça p criar vários empregados

	}

}
