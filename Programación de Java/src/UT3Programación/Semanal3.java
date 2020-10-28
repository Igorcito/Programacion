/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Semanal3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//DECLARACION DE VARIABLES:
		Scanner sc = new Scanner(System.in);
		int superficie;
		int campos;
		
		
		while (true)
		{
			System.out.println("Cuantos m2 tiene tu superficie?:");
			superficie = sc.nextInt();
			
			if (superficie == 0)
			{
				break;
			}
			System.out.println("Cuánto campos de futbos crees que son?:");
			campos = sc.nextInt();
			
			float mediaCampo = superficie / campos;
			
			if (mediaCampo >= 4050 && mediaCampo <= 10800) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

			System.out.println("");
		}
		
		System.out.println("Adios.");
		sc.close();
	}
}
		/**
		do
		{
			System.out.println("Cuantos m2 tiene tu superficie?:");
			superficie = sc.nextInt();
			System.out.println("Cuánto campos de futbos crees que son?:");
			campos = sc.nextInt();
			
			float mediaCampo = superficie / campos;
			
			if (mediaCampo >= 4050 && mediaCampo <= 10800) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		
		}
		while(superficie != 0);
		
		System.out.println("Adios.");
		
		sc.close(); **/
