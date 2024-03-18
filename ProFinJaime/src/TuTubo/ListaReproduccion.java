package TuTubo;

class ListaReproduccion {
	private Videos[] videos;
	private int IndiceVideo;

	public ListaReproduccion(int capacidadMaxima) {
		this.videos = new Videos[capacidadMaxima];
		this.IndiceVideo = 0;
	}

	public void agregarVideo(Videos video) {
		if (IndiceVideo < videos.length) {
			videos[IndiceVideo++] = video;
		} else {
			System.out.println("La lista de reproduccion esta llena, no hay hueco para mas elementos");
		}
	}

	public void eliminarVideo(Videos video) {
		boolean encontrado = false;
		for (int i = 0; i < IndiceVideo; i++) {
			if (videos[i].equals(video)) {
				encontrado = true;
				for (int j = i; j < IndiceVideo - 1; j++) {
					videos[j] = videos[j + 1];
				}
				videos[IndiceVideo - 1] = null;
				IndiceVideo--;
				System.out.println("Video eliminado exitosamente");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("El video no se encontró en la lista de reproducción");
		}
	}

	public void mostrarLista() {
		for (Videos video : videos) {
			if (video != null) {
				System.out.println(video.toString());
			}
		}
	}

	public void reproducirLista() {
		for (Videos video : videos) {
			if (video != null) {
				System.out.println("Reproduciendo: " + video.getTitulo());
			}
		}
	}
}