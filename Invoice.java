package prog2_lista1;

public class Invoice {
	private int numeroItem;
	private String descricaoItem;
	private int quantidade;
	private double precoUnitario;
	
	public Invoice (int numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
		if (quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			this.quantidade = 0;
		}
		if ( precoUnitario > 0) {
			this.precoUnitario = precoUnitario;
		} else {
			this.precoUnitario = 0.0;			//na prova vamos precisar de usar o if p verificar valores
		}
				
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public double getInvoiceAmount (double total) {
		if (precoUnitario < 0 || quantidade < 0) {
			return 0.0;
		}
		total = (this.quantidade * this.precoUnitario);
		return total;
	}
	

}
