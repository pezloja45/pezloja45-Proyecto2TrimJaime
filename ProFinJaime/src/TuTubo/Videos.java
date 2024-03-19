/**
* @author jaime
*/
package TuTubo;

/**
 * Clase abstracta Videos
 */
public abstract class Videos {
	protected int duracion;
	protected String titulo;
	protected String autor;
	protected int likes;

	enum SUBTITULOS {
		SI, NO
	}

	private SUBTITULOS subtitulos;

	/**
	 * Constructor lleno por defecto
	 * 
	 * @param duracion
	 * @param titulo
	 * @param autor
	 * @param likes
	 * @param subtitulos
	 */
	public Videos(int duracion, String titulo, String autor, int likes, SUBTITULOS subtitulos) {
		super();
		this.duracion = duracion;
		this.titulo = titulo;
		this.autor = autor;
		this.likes = likes;
		this.subtitulos = subtitulos;
	}

	/**
	 * Constructor vacio por defecto
	 */
	public Videos() {
		super();
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public SUBTITULOS getSubtitulos() {
		return subtitulos;
	}

	public void setSubtitulos(SUBTITULOS subtitulos) {
		this.subtitulos = subtitulos;
	}

	@Override
	public String toString() {
		return "Videos [duracion=" + duracion + ", titulo=" + titulo + ", autor=" + autor + ", likes=" + likes
				+ ", subtitulos=" + subtitulos + "]";
	}

	public void darLike() {
		likes++;
	}

}
