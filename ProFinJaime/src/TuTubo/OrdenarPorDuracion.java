package TuTubo;

import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Videos v1 = (Videos) o1;
		Videos v2 = (Videos) o2;

		// Manejar el caso donde uno de los videos sea null
		if (v1 == null && v2 == null) {
			return 0;
		} else if (v1 == null) {
			return 1; // Considerar el video no nulo como mayor
		} else if (v2 == null) {
			return -1; // Considerar el video no nulo como mayor
		}

		// Comparar las duraciones de los videos
		return v1.getDuracion() - v2.getDuracion();
	}
}
