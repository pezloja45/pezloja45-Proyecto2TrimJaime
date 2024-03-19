/**
* @author jaime
*/
package TuTubo;

import java.util.Scanner;

import TuTubo.Videos.SUBTITULOS;

/**
 * Clase Gameplays que extiende de la clase Videos
 */
public class Gameplays extends Videos {
	private String plataforma;

	/**
	 * Constructor vacio por defecto
	 */
	public Gameplays() {
		super();
	}

	/**
	 * Constructor lleno por defecto
	 * 
	 * @param duracion
	 * @param titulo
	 * @param autor
	 * @param likes
	 * @param subtitulos
	 * @param plataforma
	 */
	public Gameplays(int duracion, String titulo, String autor, int likes, SUBTITULOS subtitulos, String plataforma) {
		super(duracion, titulo, autor, likes, subtitulos);
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * To string.
	 *
	 * @return devuelve la cadena to string autogenerada
	 */
	@Override
	public String toString() {
		return "Gameplays [plataforma=" + plataforma + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Metodo para la creacion de un video de tipo gameplay
	 * 
	 * @return gameplay
	 */
	public Gameplays crearGameplay() {
		Scanner sc = new Scanner(System.in);
		Gameplays gameplay = new Gameplays();
		System.out.println("Ingrese la duración del gameplay en segundos:");
		int duracion = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el título del gameplay:");
		String titulo = sc.nextLine();
		System.out.println("Ingrese el autor del gameplay:");
		String autor = sc.nextLine();
		int opcion;
		do {
			System.out.println("Subtitulos, introduce 1 para SI, 2 para NO");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				gameplay.setSubtitulos(SUBTITULOS.SI);
				break;
			case 2:
				gameplay.setSubtitulos(SUBTITULOS.NO);
				break;
			}
		} while (opcion != 1 && opcion != 2);
		sc.nextLine();
		System.out.println("Ingrese la plataforma del stream:");
		String plataforma = sc.nextLine();
		gameplay.setAutor(autor);
		gameplay.setDuracion(duracion);
		gameplay.setPlataforma(plataforma);
		gameplay.setTitulo(titulo);
		return gameplay;
	}
}
