
public class Juego {

	private int cantJugadores;
	private Jugador jugadores[];
	private Revolver revolver;

	private int IDS[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private String NOMBRES[] = { "Carla", "Roberto", "Mario", "Luis", "Laura", "Florencia" };

	// constructor
	public Juego(int cantJugadores) {

		this.cantJugadores = cantJugadores;
		
		jugadores = new Jugador[cantJugadores];

		// crear jugadores
		generarDatos(jugadores, cantJugadores);

		revolver = new Revolver();
		
		finJuego();
	}

	// funciones
	private void generarDatos(Jugador jugadores[], int cantJugadores) {
		

		for (int i = 0; i < cantJugadores; i++) {

			jugadores[i] = new Jugador(IDS[i], NOMBRES[i]);
		}
	}

	// metodo para ver si el jugador muere
	public boolean finJuego() {
		for (int i = 0; i < cantJugadores; i++) {

			String nombre = jugadores[i].getNombre();
			int id = jugadores[i].getId();

			jugadores[i].isVivo(revolver);
			boolean vivo = jugadores[i].getVivo();

			ronda(nombre, id, vivo);

			if (jugadores[i].getVivo() == false) {
				return true;
			}
		}

		return false;
	}

	public void ronda(String nombre, int id, boolean vivo) {
		String salud;
		if (vivo == true) {
			salud = "VIVO";
		} else {
			salud = "MUERTO";
		}

		System.out.println("El jugador " + nombre + ", id " + id + " se encuentra " + salud);
	}
}
