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

		MacBookAir m1 = FactoriaMacs.crearMacBookAir("1", 4, 128);
		MacBookAir m2 = FactoriaMacs.crearMacBookAir("2", 4, 128);
		MacBookAir m3 = FactoriaMacs.crearMacBookAir("3", 8, 256);
		MacBookAir m4 = FactoriaMacs.crearMacBookAir("4", 8, 256);
	}

}
