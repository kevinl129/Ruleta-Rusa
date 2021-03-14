import java.util.Scanner;

public class InicioJuego {
	
	
  public static void main(String[] args) {
	   
	  Scanner teclado= new Scanner(System.in);

	  
      System.out.println("Ingresar la cantidad de jugadores(entre 2 y 6): ");
      int cantJugadores=teclado.nextInt();
      
      Juego juego=new Juego(cantJugadores);

    	 
      
      
	}

}
