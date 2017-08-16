/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configurador c = Configurador.getConfigurador("miurl", "mibaseDatos");

		System.out.println(c.getUrl());

		System.out.println(c.getBaseDatos());

	}

}
