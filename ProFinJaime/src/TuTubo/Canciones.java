package TuTubo;

import java.util.Scanner;

public class Canciones extends Videos {
	enum TIPOCANCION {
		Reggaeton, Pop, Clasica
	}

	private TIPOCANCION TipoCancion;

	public Canciones() {
		super();
	}

	public Canciones(int duracion, String titulo, String autor, int likes, SUBTITULOS subtitulos,
			TIPOCANCION TipoCancion) {
		super(duracion, titulo, autor, likes, subtitulos);
		this.TipoCancion = TipoCancion;
	}

	public TIPOCANCION getTipoCancion() {
		return TipoCancion;
	}

	public void setTipoCancion(TIPOCANCION tipoCancion) {
		TipoCancion = tipoCancion;
	}

	@Override
	public String toString() {
		return "Canciones [TipoCancion=" + TipoCancion + ", toString()=" + super.toString() + "]";
	}

	public Canciones crearCancion() {
		Scanner sc = new Scanner(System.in);
		Canciones cancion = new Canciones();
		System.out.println("Ingrese la duración de la canción en segundos:");
		int duracion = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el título de la canción:");
		String titulo = sc.nextLine();
		System.out.println("Ingrese el autor de la canción:");
		String autor = sc.nextLine();
		int opcion;
		do {
			System.out.println("Subtitulos, introduce 1 para SI, 2 para NO");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				cancion.setSubtitulos(SUBTITULOS.SI);
				break;
			case 2:
				cancion.setSubtitulos(SUBTITULOS.NO);
				break;
			}
		} while (opcion != 1 && opcion != 2);
		int opcion2;
		do {
			System.out.println("Clase de la cancion, introduce 1 para Reggaeton, 2 para Pop, 3 para Clasica");
			opcion2 = sc.nextInt();
			switch (opcion2) {
			case 1:
				cancion.setTipoCancion(TIPOCANCION.Reggaeton);
				break;
			case 2:
				cancion.setTipoCancion(TIPOCANCION.Pop);
				break;
			case 3:
				cancion.setTipoCancion(TIPOCANCION.Clasica);
				break;
			}
		} while (opcion2 != 1 && opcion2 != 2 && opcion2 != 3);
		cancion.setAutor(autor);
		cancion.setDuracion(duracion);
		cancion.setTitulo(titulo);
		return cancion;
	}

}
