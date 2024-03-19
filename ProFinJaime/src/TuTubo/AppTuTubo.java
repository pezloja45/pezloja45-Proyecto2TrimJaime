/**
* @author jaime
*/
package TuTubo;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTuTubo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ListaReproduccion lista = new ListaReproduccion(10);
		Videos[] video = new Videos[10];

		int eleccion = 1;
		while (eleccion != 9) {
			System.out.println("Introduce una opcion: ");
			eleccion = Menu();
			switch (eleccion) {
			case 1:
				crearCancion(video);
				break;
			case 2:
				crearGameplay(video);
				break;
			case 3:
				aniadirLista(sc, video, lista);
				break;
			case 4:
				borrarLista(sc, video, lista);
				break;
			case 5:
				System.out.println("Reproduciendo Lista:");
				lista.reproducirLista();
				break;
			case 6:
				System.out.println("Lista de Reproducción:");
				lista.mostrarLista();
				break;
			case 7:
				darLike(sc, video);
				break;
			case 8:
				System.out.println("Videos ordenados por duración:");
				Arrays.sort(video, new OrdenarPorDuracion());
				System.out.println(Arrays.toString(video));
				break;
			case 9:
				System.out.println("Saliendo...");
				break;
			}
		}
	}

	public static int Menu() {
		Scanner sc = new Scanner(System.in);
		boolean entradaValida = false;
		int opcion = 0;
		while (!entradaValida) {
			System.out.println("1- Crear una nueva cancion");
			System.out.println("2- Crear un nuevo gameplay");
			System.out.println("3- Añadir un video a una lista de reproduccion");
			System.out.println("4- Borrar un video de la lista de reproduccion");
			System.out.println("5- Reproducir la playlist");
			System.out.println("6- Mostrar la playlist");
			System.out.println("7- Dar like a un video");
			System.out.println("8- Mostrar videos ordenados por duracion");
			System.out.println("9- Salir");
			try {
				opcion = sc.nextInt();
				if (opcion >= 1 && opcion <= 9) {
					entradaValida = true;
				} else {
					System.out.println("Por favor, introduce una opción válida (1-9).");
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduce un número válido.");
				sc.next();
			}
		}

		return opcion;
	}

	/**
	 * Metodo que sirve para crear videos, al cual se le pasa el array de videos,
	 * busca la primera posicion disponible y añade la cancion
	 * 
	 * @param video
	 */
	public static void crearCancion(Videos[] video) {
		System.out.println("Creación de una nueva canción:");
		boolean salida = false;
		for (int i = 0; i < video.length && !salida; i++) {
			if (video[i] == null) {
				Canciones cancion = new Canciones();
				video[i] = cancion.crearCancion();
				salida = true;
			}
		}
	}

	/**
	 * Metodo que sirve para crear videos, al cual se le pasa el array de videos,
	 * busca la primera posicion disponible y añade el gameplay
	 * 
	 * @param video
	 */
	public static void crearGameplay(Videos[] video) {
		System.out.println("Creación de un nuevo gameplay:");
		boolean salida2 = false;
		for (int i = 0; i < video.length && !salida2; i++) {
			if (video[i] == null) {
				Gameplays gameplay = new Gameplays();
				video[i] = gameplay.crearGameplay();
				salida2 = true;
			}
		}
	}

	/**
	 * Metodo que se le pasa el array de videos y el array de la lista que contiene
	 * videos, y este busca la primera posicion libre para ello se usan bucles y
	 * inserta los datos en la posicion libre
	 * 
	 * @param sc
	 * @param video
	 * @param lista
	 */
	public static void aniadirLista(Scanner sc, Videos[] video, ListaReproduccion lista) {
		System.out.println("Introduce el título del video a añadir a la lista: ");
		String titulo = sc.nextLine();
		for (Videos v : video) {
			if (v != null && v.getTitulo().equals(titulo)) {
				lista.agregarVideo(v);
				break;
			}
		}
	}

	/**
	 * Metodo que se le pasa el array de videos y el array de la lista que contiene
	 * videos, y este busca la posicion del video a eliminar segun su titulo y tras
	 * ellos lo elimina de la lista
	 * 
	 * @param sc
	 * @param video
	 * @param lista
	 */
	public static void borrarLista(Scanner sc, Videos[] video, ListaReproduccion lista) {
		System.out.println("Introduce el título del video a eliminar de la lista: ");
		String titulo2 = sc.nextLine();
		boolean encontrado = false;
		for (Videos v2 : video) {
			if (v2 != null && v2.getTitulo().equals(titulo2)) {
				lista.eliminarVideo(v2);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("El video no existe");
		}
	}

	/**
	 * Metodo para dar like a un video de el array de videos
	 * 
	 * @param sc
	 * @param video
	 */
	public static void darLike(Scanner sc, Videos[] video) {
		System.out.println("Introduce el titulo del video a dar like");
		String titulo3 = sc.nextLine();
		boolean encontrado2 = false;
		for (Videos v : video) {
			if (v != null && v.getTitulo().equals(titulo3)) {
				v.darLike();
				encontrado2 = true;
				System.out.println("Has dado like al video!");
				break;
			}
		}
		if (!encontrado2) {
			System.out.println("El video no existe");
		}
	}
}