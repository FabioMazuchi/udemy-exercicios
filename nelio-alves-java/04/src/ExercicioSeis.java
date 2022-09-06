import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();

		for (int n = 1; n <= x; n++) {
			if (x % n == 0) {
				System.out.println(n);
			}
		}

		sc.close();
	}
}