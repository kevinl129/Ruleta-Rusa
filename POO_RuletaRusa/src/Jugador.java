
public class Jugador {

	private int id;
	private String nombre;
	private boolean vivo;

	// constructor
	public Jugador(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
        //si esta vivo lo analizo en el metodo isVivo
	}

	// funciones
	public void isVivo(Revolver revolver) {

		boolean auxDisparar = false;
		auxDisparar = revolver.disparar();

		if (auxDisparar == true) {
			vivo = false;
		} else {
			vivo = true;
		}

	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	

}
