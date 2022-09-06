import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas divisões você quer fazer: ");
		int qtd = sc.nextInt();

		for (int n = 1; n <= qtd; n++) {
			double dividendo = sc.nextDouble();
			double divisor = sc.nextDouble();

			if (divisor == 0) {
				System.out.println("divisão impossível");
			} else {
				double resultado = dividendo / divisor;
				System.out.printf("%.1f%n", resultado);
			}
		}

		sc.close();
	}
}
