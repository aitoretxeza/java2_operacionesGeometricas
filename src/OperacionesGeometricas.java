import java.util.Scanner;

import com.zubiri.geometria.Circulo;

import com.zubiri.geometria.Rectangulo;



/*

 *Programa para realizar operaciones geometricas.

 */

public class OperacionesGeometricas {



	public static void main (String args[]) {		



		Scanner sc = new Scanner(System.in);

		System.out.print("\nIngresa la figura geometrica (Circulo o Rectangulo): ");

		

		String str1 = sc.nextLine();

		String str2 = "Circulo";



		int result = str1.compareToIgnoreCase( str2 );

			if (result == 0){

				

				double radioIntroducido, area, circunferencia;



				Circulo circulo1 = new Circulo();

	

				Scanner sc1 = new Scanner(System.in);



				System.out.print("\nIntroduce el radio del circulo: ");



				radioIntroducido = sc1.nextDouble();



				circulo1.setRadio(radioIntroducido);



				area = circulo1.area();

				circunferencia = circulo1.circunferencia();



				System.out.println("\nEl area del circulo es: " + area + "m2");

				System.out.println("\nLa circunferencia del circulo es: " + circunferencia + "m");

				

			}

			else{

				

				

				double altoIntroducido, baseIntroducida, area, perimetro;



				Rectangulo rectangulo1 = new Rectangulo();

	

				Scanner sc2 = new Scanner(System.in);

				System.out.print("\nIntroduce el alto del rectangulo: ");

				altoIntroducido = sc2.nextDouble();



				System.out.print("\nIntroduce la base del rectangulo: ");

				baseIntroducida = sc2.nextDouble();



				rectangulo1.setAlto(altoIntroducido);

				rectangulo1.setBase(baseIntroducida);



				area = rectangulo1.area();

				perimetro = rectangulo1.perimetro();



				System.out.println("\nEl area del rectangulo es: " + area + "m2");

				System.out.println("\nEl perimetro del rectangulo es: " + perimetro + "m");

			}

	}

}
