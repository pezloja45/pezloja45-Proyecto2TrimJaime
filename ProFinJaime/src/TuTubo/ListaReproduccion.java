/**
* @author jaime
*/
package TuTubo;

/**
 * Clase ListaReproduccion
 */
public class ListaReproduccion {
	private Videos[] videos;

	/**
	 * Constructor lleno por defecto
	 * 
	 * @param capacidadMaxima
	 */
	public ListaReproduccion(int capacidadMaxima) {
		this.videos = new Videos[capacidadMaxima];
	}

	/**
	 * Metodo que se le pasa la lista de videos y agrega el que se desee en la
	 * primera posicion vacia
	 * 
	 * @param video
	 */
	public void agregarVideo(Videos video) {
		for (int i = 0; i < videos.length; i++) {
			if (videos[i] == null) {
				videos[i] = video;
				System.out.println("Video agregado exitosamente");
				return;
			}
		}
		System.out.println("La lista de reproducción está llena, no hay espacio para más elementos");
	}

	/**
	 * Metodo que se le pasa la lista de videos y elimina el que el usuario desee
	 * 
	 * @param video
	 */
	public void eliminarVideo(Videos video) {
		boolean encontrado = false;
		for (int i = 0; i < videos.length; i++) {
			if (videos[i] != null && videos[i].equals(video)) {
				videos[i] = null;
				System.out.println("Video eliminado exitosamente");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("El video no se encontró en la lista de reproducción");
		}
	}

	/**
	 * Metodo que imprime el contenido de la lista
	 */
	public void mostrarLista() {
		for (Videos video : videos) {
			if (video != null) {
				System.out.println(video.toString());
			}
		}
	}

	/**
	 * Metodo que imprime el contenido de la lista de otra manera mas estetica
	 */
	public void reproducirLista() {
		for (Videos video : videos) {
			if (video != null) {
				System.out.println("Reproduciendo: " + video.getTitulo());
			}
		}
	}

}
