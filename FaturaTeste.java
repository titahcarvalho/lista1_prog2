package prog2_lista1;

public class FaturaTeste {

	public static void main(String[] args) {
		Invoice fatura = new Invoice( 0,null,0,0/*2, "Almofada",15,3*/);
		fatura.setNumeroItem(2);
		fatura.setDescricaoItem("Almofada");
		fatura.setPrecoUnitario(15);
		fatura.setQuantidade(3); //errei aqui , na verdade não, podemos usar esses para modificar, NA VERDADE A UNICA FORMA DE ALTERAR É PELO USO DE SET E GET
		
		System.out.println("-----------------FATURA--------------------");
		System.out.println("Código do item: " + fatura.getNumeroItem());
		//fatura.setDescricaoItem("Ram ddr2 1gb");//aqui alterei a descrição do produto com o uso do setDescricao
		System.out.println("Descrição: " + fatura.getDescricaoItem());
		//fatura.setPrecoUnitario(100);//foi alterado aqui o preço do produto
		System.out.println("Preço Unitário: " + fatura.getPrecoUnitario());
		System.out.println("Quantidade total: " + fatura.getQuantidade());
		System.out.println("Valor total da fatura: " + fatura.getInvoiceAmount(0));
		
	}

}
