import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();

		System.out.print("Digite um número inteiro: ");
		y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		} else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}

		sc.close();
	}
}
