package prog2_lista1;
import java.util.Random;

public class Carro {
	private String nome;
	private String modelo;
	private String fabricante;
	private String cor;
	private String farois;
	private String tipoCombustivel;
	private double portaMalas;
	private int ano;
	private int chassi;
	private int placa;
	private int portas;
	private int pneus;

	public Carro (String nome, String modelo, String fabricante, String cor, String farois, String tipoCombustivel, double portaMalas, int ano, int chassi, int placas, int portas, int pneus, int placa ) {
		
		this.nome = nome;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.farois = farois;
		this.tipoCombustivel = tipoCombustivel;
		this.portaMalas = portaMalas;
		this.ano = ano;
		this.placa = placa;
		this.portas = portas;
		this.pneus = pneus;
		
		Random gerar = new Random();
		this.chassi = gerar.nextInt(200); //aqui o chassi está desclarado no parametro do construtor, então atribuimos um valor a ele diretamente do construtor
		System.out.println("Chassi:" + this.chassi);
		}
	public String toString() {
		return "Automóvel 1 \n Nome: " + nome + "\nModelo: " + modelo + "\nFabricante:" + fabricante + "\nCor:" + cor + "\nPorta Malas:" + portaMalas + "\n " ;//PAREI AQUI 
		
	}
	

}