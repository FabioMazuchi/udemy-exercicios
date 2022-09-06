import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Calcular o fatorial do nº: ");
		int f = sc.nextInt();

		int result = 1;

		for (int n = 1; n <= f; n++) {
			result *= n;
		}

		System.out.println(result);

		sc.close();
	}
}