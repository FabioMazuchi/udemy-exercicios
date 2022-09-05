import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		int x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha Inválida");
			System.out.print("Digite a senha: ");
			x = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();
	}
}
