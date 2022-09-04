import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		int c1, qtd1, c2, qtd2;
		double valor1, valor2, total;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		c1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();

		c2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();

		total = qtd1 * valor1 + qtd2 * valor2;

		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);

		sc.close();
	}
}
