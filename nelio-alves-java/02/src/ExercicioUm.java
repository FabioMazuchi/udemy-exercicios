import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		n = sc.nextInt();

		if (n < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}

		sc.close();
	}
}
