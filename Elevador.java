package prog2_lista1;

public class Elevador {
	private int andarAtual;
	private int totalAndar;
	private int capacidade;
	private int pessoas;
	
	public Elevador(int andarAtual, int totalAndar, int capacidade, int pessoas) {
		this.andarAtual = andarAtual;
		this.totalAndar = totalAndar;
		this.capacidade = capacidade;
		this.pessoas = pessoas;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndar() {
		return totalAndar;
	}
	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getPessoas() {
		return pessoas;
	}
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	public void inicializar(int capacidade, int totalAndar) {
		this.capacidade = capacidade;
		this.totalAndar = totalAndar;
		this.pessoas = 0;
		this.andarAtual = 0;
		
	}
	public void entrar(int pessoa, int capacidade) {
		if(capacidade >= pessoa) {
			pessoa++;
		}else {
			System.out.println("Capacidae total do elevador exedida.");
		}
		
	}
	public void sair(int pessoa, int capacidade) {
		if(capacidade <= pessoa) {
			pessoa--;
		}
		
	}
	public void subir(int totalAndar, int andarAtual) {
		if(totalAndar > andarAtual) {
			andarAtual++;
		}
	}
	public void descer(int andarAtual, int totalAndares) {
		if( andarAtual > 0) {
			andarAtual--;
		}
		
	}
	
}
