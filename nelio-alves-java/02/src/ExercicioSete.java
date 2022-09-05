import java.util.Locale;
import java.util.Scanner;

public class ExercicioSete {
	public static void main(String[] args) {
		double x, y;
		String result = "";

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor eixo x : ");
		x = sc.nextDouble();

		System.out.print("Valor eixo y : ");
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			result = "Origem";
		} else if (x > 0 && y > 0) {
			result = "Q1";
		} else if (x < 0 && y > 0) {
			result = "Q2";
		} else if (x < 0 && y < 0) {
			result = "Q3";
		} else {
			result = "Q4";
		}

		System.out.println(result);

		sc.close();
	}
}