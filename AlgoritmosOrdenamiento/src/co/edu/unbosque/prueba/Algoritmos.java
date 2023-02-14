package co.edu.unbosque.prueba;
import java.util.Scanner;

public class Algoritmos {

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
//				organizarPorBurbujaAscendente(palabras);

			}
		}
	}

	public Algoritmos () {
		
		class SelectionSort {
		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String[] words = new String[10];
		    
		    System.out.println("Ingrese 10 palabras:");
		    for (int i = 0; i < 10; i++) {
		      words[i] = sc.nextLine();
		    }
		    
		    selectionSort(words);
		    
		    System.out.println("Palabras ordenadas:");
		    for (int i = 0; i < 10; i++) {
		      System.out.println(words[i]);
		    }
		  }
		  
		  public static void selectionSort(String[] arr) {
		    int n = arr.length;
		    for (int i = 0; i < n-1; i++) {
		      int minIndex = i;
		      for (int j = i+1; j < n; j++) {
		        if (arr[j].compareTo(arr[minIndex]) < 0) {
		          minIndex = j;
		        }
		      }
		      String temp = arr[minIndex];
		      arr[minIndex] = arr[i];
		      arr[i] = temp;
		    }
		  }
		}

	}
	
	public class BubbleSort {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String[] words = new String[10];
	    
	    System.out.println("Ingrese 10 palabras:");
	    for (int i = 0; i < 10; i++) {
	      words[i] = sc.nextLine();
	    }
	    
	    bubbleSort(words);
	    
	    System.out.println("Palabras ordenadas:");
	    for (int i = 0; i < 10; i++) {
	      System.out.println(words[i]);
	    }
	  }
	  
	  public static void bubbleSort(String[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n-1; i++) {
	      for (int j = 0; j < n-i-1; j++) {
	        if (arr[j].compareTo(arr[j+1]) > 0) {
	          String temp = arr[j];
	          arr[j] = arr[j+1];
	          arr[j+1] = temp;
	        }
	      }
	    }
	  }
	}
	public class IndirectSelectionSort {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String[] words = new String[10];
	    
	    System.out.println("Ingrese 10 palabras:");
	    for (int i = 0; i < 10; i++) {
	      words[i] = sc.nextLine();
	    }
	    
	    indirectSelectionSort(words);
	    
	    System.out.println("Palabras ordenadas:");
	    for (int i = 0; i < 10; i++) {
	      System.out.println(words[i]);
	    }
	  }
	  
	  public static void indirectSelectionSort(String[] arr) {
	    int n = arr.length;
	    int[] indices = new int[n];
	    for (int i = 0; i < n; i++) {
	      indices[i] = i;
	    }
	    for (int i = 0; i < n-1; i++) {
	      for (int j = i+1; j < n; j++) {
	        if (arr[indices[j]].compareTo(arr[indices[i]]) < 0) {
	          int temp = indices[i];
	          indices[i] = indices[j];
	          indices[j] = temp;
	        }
	      }
	    }
	    String[] sorted = new String[n];
	    for (int i = 0; i < n; i++) {
	      sorted[i] = arr[indices[i]];
	    }
	    for (int i = 0; i < n; i++) {
	      arr[i] = sorted[i];
	    }
	  }
	}

}
