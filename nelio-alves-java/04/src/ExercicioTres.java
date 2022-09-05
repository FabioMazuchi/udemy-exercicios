import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("======== POSTO DE COMBUTÍVEL =========");
		System.out.printf("1 - Álcool%n2 - Gasolina%n3 - Diesel%n4 - Fim%n");
		System.out.println("======================================");

		System.out.print("Opção nº: ");
		int n = sc.nextInt();

		while (n != 4) {
			if (n == 1) {
				alcool += 1;
			} else if (n == 2) {
				gasolina += 1;
			} else if (n == 3) {
				diesel += 1;
			} else {
				System.out.println("Código Inválido");
			}

			System.out.print("Opção nº: ");
			n = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
