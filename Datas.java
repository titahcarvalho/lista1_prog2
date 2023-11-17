package prog2_lista1;
import java.time.LocalDate;

public class Datas {
	private int dia;
	private int mes;
	private int ano;

	
	public Datas(int dia, int mes, int ano) {//com parametros
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	public Datas() {//sem parametros
		LocalDate dataLocal = LocalDate.now();
		this.dia = dataLocal.getDayOfMonth();
		this.mes = dataLocal.getMonthValue();
		this.ano = dataLocal.getYear();
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
	public String toString () {
		return String.format("%02d/%02d/%02d", dia, mes, ano);
	}
} 

