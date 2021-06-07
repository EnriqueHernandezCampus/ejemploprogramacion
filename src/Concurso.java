import java.util.Scanner;

public class Concurso {

	public static void main(String[] args) {
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		int puntos = 25;
		Scanner sc = new Scanner(System.in);

		String pregunta[] = { "¿Cuál es el rio más largo del mundo?", "¿Cuál es la capital de Egipto?", "¿Quién tiene más Champions, Messi o CR7?",
				"¿Cuál es la capital de España?", "¿Cuánto son 2+3?" };

		while (contador1 < 5) {
			String respuesta;
			if (contador1 <= 4) {
				System.out.println(pregunta[0]);
			}
			respuesta = sc.nextLine();
			if (respuesta.toLowerCase().equals("nilo")) {
				break;
			} else {
				puntos--;
			}

			contador1++;
			if (contador1 == 5) {
				System.out.println("Has fallado 5 veces, se acabó el concurso");
				return;
			}
		}
		System.out.println("--------------");
		System.out.println("ACERTASTE, siguiente pregunta");
		System.out.println("--------------");
		while (contador2 < 5) {

			String respuesta;
			if (contador2 <= 4) {
				System.out.println(pregunta[1]);
			}
			respuesta = sc.nextLine();
			if (respuesta.toLowerCase().equals("el cairo")) {
				break;
			} else {
				puntos--;
			}

			contador2++;
			if (contador2 == 5) {
				System.out.println("Has fallado 5 veces, se acabó el concurso");
				return;
			}
		}
		System.out.println("--------------");
		System.out.println("ACERTASTE, siguiente pregunta");
		System.out.println("--------------");
		while (contador3 < 5) {

			String respuesta;
			if (contador3 <= 4) {
				System.out.println(pregunta[2]);
			}
			respuesta = sc.nextLine();
			if (respuesta.toLowerCase().equals("cr7")) {
				break;
			} else {
				puntos--;
			}
			contador3++;
			if (contador3 == 5) {
				System.out.println("Has fallado 5 veces, se acabó el concurso");
				return;
			}
		}
		System.out.println("--------------");
		System.out.println("ACERTASTE, siguiente pregunta");
		System.out.println("--------------");
		while (contador4 < 5) {

			String respuesta;
			if (contador4 <= 4) {
				System.out.println(pregunta[3]);
			}
			respuesta = sc.nextLine();
			if (respuesta.toLowerCase().equals("madrid")) {
				break;
			} else {
				puntos--;
			}
			contador4++;
			if (contador4 == 5) {
				System.out.println("Has fallado 5 veces, se acabó el concurso");
				return;
			}
		}
		System.out.println("--------------");
		System.out.println("ACERTASTE, siguiente pregunta");
		System.out.println("--------------");
		while (contador5 < 5) {

			String respuesta;
			if (contador5 <= 4) {
				System.out.println(pregunta[4]);
			}
			respuesta = sc.nextLine();
			if (respuesta.toLowerCase().equals("5")) {
				break;
			} else {
				puntos--;
			}
			contador5++;
			if (contador5 == 5) {
				System.out.println("Has fallado 5 veces, se acabó el concurso");
				return;
			}
		}
		System.out.println("se acabó. tu puntuación es de :" + puntos);
		sc.close();
	}

}
