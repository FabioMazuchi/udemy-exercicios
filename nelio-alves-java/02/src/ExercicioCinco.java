import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {

		System.out.println("GODIGO     ESPECIFICAÇÃO       PREÇO");
		System.out.println("---------------------------------------");
		System.out.println("  1        Cachorro Quente     R$ 4.00");
		System.out.println("  2        X-Salada            R$ 4.50");
		System.out.println("  3        X-Bacon             R$ 5.00");
		System.out.println("  4        Torrada             R$ 2.00");
		System.out.println("  5        refrigerante        R$ 1.50");
		System.out.println("---------------------------------------");

		double total = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código: ");
		int cod = sc.nextInt();

		System.out.println("Digite a quantidade: ");
		int qtd = sc.nextInt();

		if (cod == 1) {
			total = qtd * 4;
		} else if (cod == 2) {
			total = qtd * 4.5;
		} else if (cod == 3) {
			total = qtd * 5;
		} else if (cod == 4) {
			total = qtd * 2;
		} else if (cod == 5) {
			total = qtd * 1.5;
		} else {
			System.out.println("CÓDIGO INVÁLIDO");
		}

		Locale.setDefault(Locale.US);
		System.out.printf("Total : R$ %.2f%n", total);

		sc.close();
	}
}