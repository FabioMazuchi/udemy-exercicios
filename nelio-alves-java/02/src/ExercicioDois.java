import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		sc.close();
	}
}
