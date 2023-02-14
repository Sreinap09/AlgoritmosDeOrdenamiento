package co.edu.unbosque.prueba;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarMenu();
	}

	public static void mostrarMenu() {
		System.out.println("Acontinuacion ingrese 10 palabras");
		Scanner sc = new Scanner(System.in);
		String palabras[] = new String[10];
		for (int i = 0; i < 10; i++) {
			palabras[i] = sc.nextLine();
		}
		System.out.println(
				"Escoja que metodo desea usar para ordenar las palabras \n 1)Burbuja \n 2)Seleccion directa \n 3)Seleccion indirecta");
		String metodo = sc.next();

		System.out.println("Como desea ordenar las palabras? \n 1)Ascendente \n 2)Descendente");
		String ordenamiento = sc.next();
		if (metodo.equalsIgnoreCase("1")) {
			if (ordenamiento.equalsIgnoreCase("1")) {
				organizarPorBurbujaAscendente(palabras);

			}
		}
	}

	public static void organizarPorBurbujaAscendente(String[] palabras) {
		for (int i = 0; i < palabras.length - 2; i++) {
			String palabra1 = palabras[i];
			String palabra2 = palabras[i + 1];
			if (palabra1.compareTo(palabra2) > 0) {
				palabras[i] = palabra2;
				palabras[i + 1] = palabra1;
			}
			imprimirArreglo1(palabras);
		}
	}
	public static void imprimirArreglo1(String[] palabras) {
		System.out.println(" ");

		for (int i = 0; i < 10; i++) {
			System.out.print(palabras[i]);
		}
	}

	public static void organizarPorBurbujaDescendente(String[] palabras) {
		for (int j = 0; j < palabras.length - 1; j++) {
			for (int i = 0; i < palabras.length - 2; i++) {
				String palabra1 = palabras[i];
				String palabra2 = palabras[i + 1];
				if (palabra1.compareTo(palabra2) < 0) {
					palabras[i] = palabra2;
					palabras[i + 1] = palabra1;
				}
				imprimirArreglo2(palabras);
			}
		}
	}
	public static void imprimirArreglo2(String[] palabras) {
		System.out.println(" ");

		for (int i = 0; i < 10; i++) {
			System.out.print(palabras[i]);
		}
	}

	public static void organizarPorSeleccionDirectaAscendente(String[] palabras) {
		for (int i = 0; i < palabras.length - 1; i++) {
			for (int j = i + 1; j < palabras.length ; j++) {
				if (palabras.length > 0) {
					String temporal = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = temporal;
//					palabras[i] = palabra2;
//					palabras[i + 1] = palabra1;
//					String palabra1 = palabras[i];
//					String palabra2 = palabras[i + 1];
				}
				imprimirArreglo1(palabras);
			}
		}
	}
	public static void organizarPorSeleccionDirectaDescendente(String[] palabras) {
		for (int i = 0; i < palabras.length - 1; i++) {
			for (int j = i + 1; j < palabras.length ; j++) {
				if (palabras.length < 0) {
					String temporal = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = temporal;
//					palabras[i] = palabra2;
//					palabras[i + 1] = palabra1;
//					String palabra1 = palabras[i];
//					String palabra2 = palabras[i + 1];
				}
				imprimirArreglo1(palabras);
			}
		}
	}
	public static void organizarPorSeleccionIndirectaAscendente(String[] palabras) {
		for (int j = 0; j < palabras.length - 1; j++) {
			for (int i = 0; i < palabras.length - 2; i++) {
				String palabra1 = palabras[i];
				String palabra2 = palabras[i + 1];
				if (palabra1.compareTo(palabra2) > 0) {
					palabras[i] = palabra2;
					palabras[i + 1] = palabra1;
				}
				imprimirArreglo1(palabras);
			}
		}
	}
	public static void organizarPorSeleccionIndirectaDescendente(String[] palabras) {
		for (int j = 0; j < palabras.length - 1; j++) {
			for (int i = 0; i < palabras.length - 2; i++) {
				String palabra1 = palabras[i];
				String palabra2 = palabras[i + 1];
				if (palabra1.compareTo(palabra2) > 0) {
					palabras[i] = palabra2;
					palabras[i + 1] = palabra1;
				}
				imprimirArreglo1(palabras);
			}
		}
	}
 }
