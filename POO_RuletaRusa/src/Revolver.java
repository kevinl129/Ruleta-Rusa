
public class Revolver {

	private int posTambor;
	private int posBala;

	// costructor
	public Revolver() {
		// la posicion del tambor
		posTambor = NumAleatorios.generarNumeroAleatorio(1, 6);

		// la posicion de la bala
		posBala = NumAleatorios.generarNumeroAleatorio(1, 6);

		mostrar();
	}

	// funciones
	public boolean disparar() {

		boolean disparo = false;

		if (posBala == posTambor) {
			disparo = true;
		}
		siguienteBala();
		return disparo;
	}

	private int siguienteBala() {

		if (posTambor == 6) {
			posTambor = 1;
		} else {

			posTambor++;
		}
		return posTambor;
	}

	private void mostrar() {

		System.out.println("Posicion del tambor: " + posTambor + ", posicion de la bala: " + posBala);
	}

	// GETTERS Y SETTERS
	public int getPosTambor() {
		return posTambor;
	}

	public void setPosTambor(int posTambor) {
		this.posTambor = posTambor;
	}

	public int getPosBala() {
		return posBala;
	}

	public void setPosBala(int posBala) {
		this.posBala = posBala;
	}

}
