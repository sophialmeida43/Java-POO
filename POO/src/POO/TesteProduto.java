package POO;

public class TesteProduto {

	public static void main(String[] args) {

		Produto produto1 = new Produto();

		produto1.nome = "Mouse Gamer";
		produto1.preco = 150.00;
		produto1.quantidadeEstoque = 10;

		System.out.println("Produto: " + produto1.nome);
		System.out.println("Preço: R$ " + produto1.preco);
		System.out.println("Quantidade em estoque: " + produto1.quantidadeEstoque);

		double valorTotal = produto1.calcularValorEstoque();

		System.out.println("Valor total em estoque: R$ " + valorTotal);
	}
}