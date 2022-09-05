import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		int numberFunc, horas;
		double salary, total;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		numberFunc = sc.nextInt();
		horas = sc.nextInt();
		salary = sc.nextDouble();

		total = horas * salary;

		System.out.println("NUMBER = " + numberFunc);
		System.out.printf("SALARY = U$ %.2f%n", total);
	}
}
