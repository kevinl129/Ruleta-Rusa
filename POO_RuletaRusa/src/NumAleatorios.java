
public class NumAleatorios {

	public static int generarNumeroAleatorio(int inicio, int ultimo) {

		int num = (int) Math.floor(Math.random() * (inicio - (ultimo + 1)) + (ultimo + 1));
		return num;
	}
}
