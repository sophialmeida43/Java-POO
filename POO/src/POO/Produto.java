package POO;

public class Produto {

	String nome;
	double preco;
	int quantidadeEstoque;

	double calcularValorEstoque() {
		return preco * quantidadeEstoque;
	}
}