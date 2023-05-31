package exemplo;

public class Produto {
	//atributos
	private int idProduto;
	private String nome;
	private double preco;
	private int quantidade;	
	
	//construtores
	public Produto(int tempIdProduto, int tempQuantidade, String tempNome, double tempPreco){
		this.idProduto = tempIdProduto;
		this.nome = tempNome;
		this.preco = tempPreco;
		this.quantidade = tempQuantidade;
	}
	//Getters and Setters
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Produtos [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}