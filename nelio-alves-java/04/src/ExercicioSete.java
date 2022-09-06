import java.util.Scanner;

public class ExercicioSete {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();

		for (int n = 1; n <= x; n++) {
			int a = (int) Math.pow(n, 2);
			int b = (int) Math.pow(n, 3);

			System.out.printf("%d %d %d%n", n, a, b);
		}
		sc.close();
	}
}