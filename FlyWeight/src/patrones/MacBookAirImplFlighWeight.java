/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class MacBookAirImplFlighWeight implements MacBookAir {

	private String id;
	private MacLigero macLigero;

	public MacBookAirImplFlighWeight(String id, MacLigero macLigero) {
		super();
		this.id = id;

	}

	public int getRam() {
		return macLigero.getRam();
	}

	public int getDisco() {
		return macLigero.getDisco();
	}

	@Override
	public String getId() {
		return id;
	}
}
