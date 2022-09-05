import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		double A, B, C, tri, cir, tra, qua, ret;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		tri = (A * C) / 2;
		cir = 3.14159 * Math.pow(C, 2);
		tra = ((A + B) * C) / 2;
		qua = Math.pow(B, 2);
		ret = A * B;

		System.out.printf("TRIÂNGULO = %.3f%n", tri);
		System.out.printf("CÍRCULO = %.3f%n", cir);
		System.out.printf("TRAPÉZIO = %.3f%n", tra);
		System.out.printf("QUADRADO = %.3f%n", qua);
		System.out.printf("RETÂNGULO = %.3f%n", ret);

		sc.close();
	}
}
