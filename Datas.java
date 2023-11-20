package prog2_lista1;
import java.time.LocalDate;

public class Datas {
	private int dia;
	private int mes;
	private int ano;

	
	public Datas(int dia, int mes, int ano) {//construtor com parametros
		if (validarData(dia,mes,ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			System.out.println("Data válida.");
		} else {
			System.out.println("Data inválida.");
		}
		
	}
	public Datas() {//sem parametros
		LocalDate dataLocal = LocalDate.now();
		this.dia = dataLocal.getDayOfMonth();
		this.mes = dataLocal.getMonthValue();
		this.ano = dataLocal.getYear();
		
		if(validarData(this.dia,this.mes,this.ano)) {
		System.out.println("Data válida");
		} else {
			System.out.println("Data Inválida.");
		}
	}
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
	public boolean validarData(int dia, int mes, int ano) {
		boolean dataValida = dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12; 
			return dataValida;
			}
	public void avancarDia(int dias) {
		for(int diaSeguinte = 0; diaSeguinte < dias; diaSeguinte++) {
			dia++;
		}
	}
	public String toString () {
		return String.format("%02d/%02d/%02d", dia, mes, ano);
	}
} 

