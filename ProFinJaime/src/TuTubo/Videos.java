package TuTubo;

public abstract class Videos {
	private int duracion;
	private String titulo;
	private String autor;
	private int likes;

	enum SUBTITULOS {
		SI, NO
	}

	private SUBTITULOS subtitulos;

	public Videos(int duracion, String titulo, String autor, int likes, SUBTITULOS subtitulos) {
		super();
		this.duracion = duracion;
		this.titulo = titulo;
		this.autor = autor;
		this.likes = likes;
		this.subtitulos = subtitulos;
	}

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
