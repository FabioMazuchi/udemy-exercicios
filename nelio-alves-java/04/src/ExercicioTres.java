import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores você quer digitar: ");
		int qtd = sc.nextInt();

		for (int n = 1; n <= qtd; n++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}
