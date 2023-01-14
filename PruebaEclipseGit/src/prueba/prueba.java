package prueba;

import java.util.Scanner;
public class prueba {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			//Escriba un programa que convierta grados Celsius en Fahrenheit y viceversa, a elección del usuario. La relación entre ambos es F=(9/5)*C+32.
			boolean salir = false;
			int opcion;
			double fahrenheit, celsius;
			        
			while(!salir){
			      System.out.println("Opción 1. Conversor de grados Celsius a Fahrenheit");
			      System.out.println("Opción 2. Conversor de grados Fahrenheit a Celsius");
			      System.out.println("Opción 3. Salir");
			      System.out.println("Elija una opción de conversor.");
			      opcion=teclado.nextInt();
			            
			      switch(opcion){
			          case 1:
			             System.out.println("Ingrese un número de grados Celsius");
			             celsius=teclado.nextDouble();
			             fahrenheit = (double) (celsius * (9.0 / 5) + 32);
			             System.out.println("Son " + fahrenheit + " grados Fahrenheit");
			             break;
			          case 2:
			             System.out.println("Ingrese un número de grados Fahrenheit");
			             fahrenheit=teclado.nextDouble();
			             celsius = (double) ((fahrenheit - 32) * (5.0 / 9));
			             System.out.println("Son " + celsius + " grados Celsius");
			             break;
			          case 3:
			             salir = true;
			             System.out.println("Has salido del conversor");
			             break;
			       }
			 }
		}
	}
}
