package TuTubo;

import java.util.Scanner;

public class AppTuTubo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ListaReproduccion lista = new ListaReproduccion(10);
		Videos[] video = new Videos[5];

		int eleccion = 1;
		while (eleccion != 7) {
			System.out.println("Introduce una opcion: ");
			eleccion = Menu();
			switch (eleccion) {
			case 1:
				System.out.println("Creación de una nueva canción:");
				boolean salida = false;
				for (int i = 0; i < video.length && !salida; i++) {
					if (video[i] == null) {
						Canciones cancion = new Canciones();
						video[i] = cancion.crearCancion();
						salida = true;
					}
				}
				break;
			case 2:
				System.out.println("Creación de un nuevo gameplay:");
				boolean salida2 = false;
				for (int i = 0; i < video.length && !salida2; i++) {
					if (video[i] == null) {
						Gameplays gameplay = new Gameplays();
						video[i] = gameplay.crearGameplay();
						salida2 = true;
					}
				}
				break;
			case 3:
				System.out.println("Introduce el título del video a añadir a la lista: ");
				String titulo = sc.nextLine();
				for (Videos v : video) {
					if (v != null && v.getTitulo().equals(titulo)) {
						lista.agregarVideo(v);
						break;
					}
				}
				break;
			case 4:
				System.out.println("Introduce el título del video a eliminar de la lista: ");
				String titulo2 = sc.nextLine();
				for (Videos v2 : video) {
					if (v2 != null && v2.getTitulo().equals(titulo2)) {
						lista.eliminarVideo(v2);
						break;
					}
				}
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
				System.out.println("Saliendo...");
				break;
			}
		}
	}

	public static int Menu() {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			System.out.println("1- Crear una nueva cancion");
			System.out.println("2- Crear un nuevo gameplay");
			System.out.println("3- Añadir un video a una lista de reproduccion");
			System.out.println("4- Borrar un video de la lista de reproduccion");
			System.out.println("5- Reproducir la playlist");
			System.out.println("6- Mostrar la playlist");
			System.out.println("7- Salir");

			String entrada = sc.nextLine();

			try {
				eleccion = Integer.parseInt(entrada);
				if (eleccion >= 1 && eleccion <= 7) {
					entradaValida = true;
				} else {
					System.out.println("Por favor, introduce una opción válida (1-7).");
				}
			} catch (NumberFormatException e) {
				System.out.println("Por favor, introduce un número válido.");
			}
		}

		return eleccion;
	}
}