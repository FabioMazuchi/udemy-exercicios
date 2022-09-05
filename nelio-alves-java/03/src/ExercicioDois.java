import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Coordenada x: ");
		int x = sc.nextInt();

		System.out.print("Coordenada y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}

			System.out.print("Coordenada x: ");
			x = sc.nextInt();

			System.out.print("Coordenada y: ");
			y = sc.nextInt();
		}

		sc.close();
	}
}
