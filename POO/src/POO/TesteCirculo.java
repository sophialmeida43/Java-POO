package POO;

public class TesteCirculo {

	public static void main(String[] args) {

		Circulo c1 = new Circulo();

		c1.raio = 5;

		double area = c1.calcularArea();

		System.out.println("Raio: " + c1.raio);
		System.out.println("Área do círculo: " + area);
	}
}