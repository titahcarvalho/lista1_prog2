package prog2_lista1;

public class CarroTeste {

	public static void main(String[] args) {
		Carro Chevette = new Carro("Chevette","Chevrollet","Ford","Branco","Gasolina",1982,1234560,"ABC123",250,250,20,60,false,true, true, false);

		Chevette.ligar();
		Chevette.abastecer(45);
		Chevette.acelerar();
		System.out.println(Chevette.toString());
		System.out.println(Chevette.mostrarPainel());
		Chevette.desligar();
		Chevette.ligarFarois();
		Chevette.desligarSeta('D');
	
		
	}

}
