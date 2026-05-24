package POO;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();

		p1.nome = "Sophia";
		p1.idade = 16;
		p1.altura = 1.65;

		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade antes: " + p1.idade);

		p1.fazerAniversario();

		System.out.println("Idade depois: " + p1.idade);
	}
}
