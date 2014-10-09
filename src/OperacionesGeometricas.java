import java.util.Scanner;

import com.zubiri.geometria.Circulo;

import com.zubiri.geometria.Rectangulo;

//Programa para realizar operaciones geometricas.

public class OperacionesGeometricas {

	public static void main (String args[]) {		

		Scanner sc = new Scanner(System.in);

		System.out.print("\nIngresa la figura geometrica Circulo (C) o Rectangulo (R) o Terminar el programa (T): ");

		String respuesta = sc.nextLine();
 
		char respuestaChar = respuesta.charAt(0);
		
		while ((respuestaChar != 'T') && (respuestaChar != 't')){

			if ((respuestaChar == 'C') || (respuestaChar == 'c')){

				double radioIntroducido, area, circunferencia;

				Scanner sc1 = new Scanner(System.in);

				System.out.print("\nIntroduce el radio del circulo: ");

				radioIntroducido = sc1.nextDouble();

				Circulo circulo1 = new Circulo(radioIntroducido);

				area = circulo1.area();

				circunferencia = circulo1.circunferencia();

				System.out.println("\nEl area del circulo es: " + area + "m2");

				System.out.println("\nLa circunferencia del circulo es: " + circunferencia + "m");
			
			}

			else if ((respuestaChar == 'R') || (respuestaChar == 'r')){

				double altoIntroducido, baseIntroducido, area, perimetro;

				Scanner sc2 = new Scanner(System.in);

				System.out.print("\nIntroduce el alto del rectangulo: ");

				altoIntroducido = sc2.nextDouble();

				System.out.print("\nIntroduce la base del rectangulo: ");

				baseIntroducido = sc2.nextDouble();

				Rectangulo rectangulo1 = new Rectangulo(altoIntroducido, baseIntroducido);

				area = rectangulo1.area();

				perimetro = rectangulo1.perimetro();

				System.out.println("\nEl area del rectangulo es: " + area + "m2");

				System.out.println("\nEl perimetro del rectangulo es: " + perimetro + "m");

			}

			else {

				System.out.print("\nCaracter no valido");

			}
			
			System.out.print("\nIngresa la figura geometrica Circulo (C) o Rectangulo (R) o Terminar el programa (T): ");

			respuesta = sc.nextLine();
 
			respuestaChar = respuesta.charAt(0);

		}

		System.out.print("\nFin\n");

	}

}
