import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro de 1 a 1000: ");
		int x = sc.nextInt();

		if (x <= 0 || x > 1000) {
			System.out.println("Valor Inválido");
		} else {
			for (int n = 1; n <= x; n++) {
				if (n % 2 == 1) {
					System.out.println(n);
				}
			}
		}

		sc.close();
	}
}
