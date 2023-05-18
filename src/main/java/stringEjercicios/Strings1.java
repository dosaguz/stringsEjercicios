package stringEjercicios;

import java.util.Scanner;

public class Strings1 {
	static public String ejercicio1(){
		System.out.print("Escribe una String: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		int contador = 0;
		for(int i=0; i<cadena.length();i++) {
			if (cadena.charAt(i)=='a' ||cadena.charAt(i)=='e' ||cadena.charAt(i)=='i' ||cadena.charAt(i)=='o' 
				||cadena.charAt(i)=='u' ||cadena.charAt(i)=='A' ||cadena.charAt(i)=='E'||cadena.charAt(i)=='I' 
				||cadena.charAt(i)=='O'||cadena.charAt(i)=='U') {
				contador++;
			}
		}
		
		return "La cantidad de vocales es " + contador;
	}
	static public String ejercicio2(){
		System.out.print("Escribe una String: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String invertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invertida += cadena.charAt(i);
		};
		return invertida;
	}
	static public String ejercicio3(){
		System.out.print("Escribe una String: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		System.out.print("Escribe un caracter: ");
		Scanner sc2 = new Scanner(System.in);
		char car = sc2.next().charAt(0);
		int contador = 0;
		for(int i=0; i<cadena.length();i++) {
			if (cadena.charAt(i)==car) {
				contador++;
			}
		}
		return "El caracter "+ car+" se repite "+contador+ " veces";
	}
	
	static public void ejercicio4(){

    // Pedir dos strings por consola
    System.out.print("Ingrese el primer string (a): ");
	Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();

    System.out.print("Ingrese el segundo string (b): ");
	Scanner sc2 = new Scanner(System.in);
    String b = sc.nextLine();

    // Comparar los dos strings y verificar si son iguales
    if (a.equals(b)) {
        System.out.println("Los strings a y b son iguales.");
    } 
    else {
        System.out.println("Los strings a y b son diferentes.");
    }

    // Crear otro string "c" con la concatenación de a y b
    String c = a + b;

    // Crear otro string "d" con la concatenación de a y b otra vez
    String d = a.concat(b);

    // Comparar los strings c y d y verificar si son iguales
    if (c.equals(d)) {
        System.out.println("Los strings c y d son iguales.");
    } else {
        System.out.println("Los strings c y d son diferentes.");
    }

    // Indicar cuántos caracteres tiene cada uno de los strings
    System.out.println("El string a tiene " + a.length() + " caracteres.");
    System.out.println("El string b tiene " + b.length() + " caracteres.");

    // Copiar el string a en el string b
    b = a;

    // Utilizar replace para modificar el string a
    a = a.replace("a", "x");

    // Presentar en consola el contenido de la string a y de la string b
    System.out.println("Contenido del string a: " + a);
    System.out.println("Contenido del string b: " + b);

}
	public static int ejercicio5(){
		System.out.print("Escribe un numero: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		Integer numInteger= Integer.valueOf(cadena);
		int numInt = numInteger.intValue();
		
		return numInt;
	}
	public static float ejercicio6(){
		System.out.print("Escribe un numero decimal: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		Float numFloat= Float.valueOf(cadena);
		float numF = numFloat.floatValue();
		
		return numF;
	}
	public static void main(String[] args) {
	//System.out.println(ejercicio1());	
	System.out.println(ejercicio6());	
	//ejercicio4();
	}
}
