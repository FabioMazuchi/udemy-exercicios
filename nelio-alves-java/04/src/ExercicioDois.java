import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = 0;
		int out = 0;

		System.out.print("Quantos valores você quer digitar: ");
		int qtd = sc.nextInt();

		for (int n = 1; n <= qtd; n++) {
			System.out.print(n + "º valor inteiro: ");
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
