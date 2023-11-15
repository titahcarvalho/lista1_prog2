package prog2_lista1;
import java.util.Date;

public class Empregados {
	private String primeiroNome;
	private String sobrenome;
	private Date dataInicio;
	private double salarioMensal;
	
	public Empregados (String primeiroNome, String sobrenome, Date dataInicio, double salarioMensal) {
		
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataInicio = dataInicio;
		setSalarioMensal(salarioMensal);
		
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0.0;
		}
		
	}
	public double salarioAnual() {
		return salarioMensal * 12;
	}
	public void salarioNovoAumento() {
		double aumento = salarioMensal * 0.1;
		salarioMensal += aumento;
	}
}
