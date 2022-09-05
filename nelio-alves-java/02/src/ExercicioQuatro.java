import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		int inicio, fim, duracao;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o horário de início do jogo: ");
		inicio = sc.nextInt();

		System.out.print("Digite o horário do fim do jogo: ");
		fim = sc.nextInt();

		if (inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (inicio > fim) {
			duracao = (24 - inicio) + fim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

		sc.close();
	}
}
