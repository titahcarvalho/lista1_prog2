package prog2_lista1;

public class Carro {
	private String nome;
	private String modelo;
	private String fabricante;
	private String cor;
	private String tipoCombustivel;
	private int ano;
	private int chassi;
	private String placa;
	private int velocidade;
	private int velocidadeMax;
	private double tanque;
	private double tanqueMax;
	private boolean estado;
	private boolean setaEsquerda;
	private boolean setaDireita;
	private boolean farois;
	

	public Carro (String nome, String modelo, String fabricante, String cor, String tipoCombustivel, int ano, int chassi, String placa, int velocidade, int velocidadeMax, double tanque, double tanqueMax, boolean setaEsquerda, boolean farois, boolean setaDireita, boolean estado) { //uso de parametros
		
		this.nome = nome;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.tipoCombustivel = tipoCombustivel;
		this.ano = ano;
		this.velocidade = velocidade;
		this.velocidadeMax = 200;
		this.farois = farois;
		this.setaEsquerda = setaEsquerda;
		this.setaDireita = setaDireita;
		this.estado = estado;
		this.chassi = chassi;
		this.placa = placa;
		
		}
		public void ligar() {
			estado = true;
			
		}
		public void desligar() {
			estado = false;
		}
		public void acelerar() {
			if (estado == true)
			if(velocidade < velocidadeMax)
				velocidade += 1;
						
		}
		public void freiar() {
			if (estado == true)
				if(velocidade > 0)
					velocidade -= 1;
			
		}
		public void ligarFarois() {
			if (estado == true) {
				farois = true;				
			} else {
				farois = false;
			}
		}
		public void desligarFarois() {
			if (estado == false) {
				farois = false;				
			}
		}
		public void ligarSeta(char lado) {
			if (lado =='E')
				setaEsquerda = true;
			else
				setaDireita = true;
						
		}
		public void desligarSeta(char lado) {
			if (lado =='E')
				setaEsquerda = false;
			else
				setaDireita = false;
						
		}
	
		public void abastecer( double litros) {
			if (tanque + litros <= tanqueMax)
				tanque += litros;
		}
		public String mostrarPainel() {
			return "Velocidade: " + velocidade +"\nQuantidade de combustivel: "+ tanque + "\nFarois: " + farois +"\nSeta Direita:" + setaDireita + "\nSeta Esquerda:" + setaEsquerda;
			}
		
		public String toString() {
			return "--------------------- Automóvel 1 -----------------\nNome: " + nome + "\nModelo: " + modelo + "\nFabricante:" + fabricante + "\nCor:" + cor + "\nChassi: " + chassi +"\nTipo de combustível:" + tipoCombustivel + "\nAno: " + ano + "\nPlaca:" + placa; 
		
		
	}
	

}