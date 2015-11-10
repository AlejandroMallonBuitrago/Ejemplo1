import acm.program.*;
import acm.graphics.GRect;

/*
 * La clase Piramide dibujará una pirámide de ladrillos
 * 
 * Vamos a definir tres constantes el inicio de la clase
 * 
 * private static final int ANCHO_LADRILLO = 30;	
 * private static final int ALTO_LADRILLO = 12;
 * private static final int LADRILLOS_BASE = 14;
 * 
 */

public class Piramide extends GraphicsProgram{



	public void run(){

		setSize(800, 600);

		pintaPiramide();

	}


	public void pintaPiramide(){

		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		
		
		int altoPiramide = numLadrillosBase * altoLadrillo;
		int basePiramide = numLadrillosBase * anchoLadrillo;
		
		
		//terminado y probado con varios tamaños de ladrillo 
		for (int j=0; j< numLadrillosBase; j++){
			for (int i=0; i< numLadrillosBase -j; i++){
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				add(ladrillo, getWidth()/2 - basePiramide/2 + anchoLadrillo *j/2 + anchoLadrillo * i, getHeight() - altoLadrillo - altoLadrillo * j);
				pause(30);
			}
		}
	}
}



