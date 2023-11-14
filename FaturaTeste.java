package prog2_lista1;

public class FaturaTeste {

	public static void main(String[] args) {
		Invoice fatura = new Invoice( 2, "Almofada",15,3);
		/*fatura.setNumeroItem(2);
		fatura.setDescricaoItem("Almofada");
		fatura.setPrecoUnitario(15);
		fatura.setQuantidade(3);*/ //errei aqui 
		
		System.out.println("FATURA");
		System.out.println("Código do item: " + fatura.getNumeroItem());
		System.out.println("Descrição: " + fatura.getDescricaoItem());
		System.out.println("Preço Unitário: " + fatura.getPrecoUnitario());
		System.out.println("Quantidade total: " + fatura.getQuantidade());
		System.out.println("Valor total da fatura: " + fatura.getInvoiceAmount());
		
	}

}
