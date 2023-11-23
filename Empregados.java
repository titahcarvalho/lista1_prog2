package prog2_lista1;
//import java.util.Date;

public class Empregados {
	private String primeiroNome;
	private String sobrenome;
	private int dia,mes,ano;
	//private Date dataInicio;
	private double salarioMensal;
	private static int n; //para a questão 10; static = tem o mesmo valor para todas as instancias
	
	public Empregados (String primeiroNome, String sobrenome, int dia, int mes , int ano, /*Date dataInicio*/ double salarioMensal) {//int dia, int mes , int ano...
		
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		//this.dataInicio = dataInicio;
		if ((ano > 1900) && (mes >= 1) && (mes <= 12)) {
			if((dia>= 1) && (dia <=31)){
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			} else {
				this.dia = 20;
				this.mes = 11;
				this.ano = 2023;
		}
			}
		if(salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0.0;
		}
		n++;
		//setSalarioMensal(salarioMensal);
		
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

	/*public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}*/

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		/*if(salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0.0;if(salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0.0;}*/
			//n++ //tem como passar essa verificação no construtor
		
	}
	public double salarioAnual() {
		return salarioMensal * 12; /*double valorTotal = salarioMensal * 12;
		return valorTotal;*/   //mesma coisa
	}
	public void salarioNovoAumento() {
		double aumento = salarioMensal * 0.1;
		salarioMensal += aumento;
	}
	public int getTotal() {
		return n;
	}
}
