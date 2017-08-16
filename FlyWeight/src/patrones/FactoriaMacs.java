/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class FactoriaMacs {

	public static MacBookAir crearMacBookAir(String id, int ram, int disco) {

		MacLigero macLigero = ContenedorMacLogico.getMacLigero(ram, disco);
		MacBookAir macBookAir = new MacBookAirImplFlighWeight(id, macLigero);
		return macBookAir;

	}
}
