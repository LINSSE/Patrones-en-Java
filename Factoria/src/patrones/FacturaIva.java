/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class FacturaIva extends Factura {

	public double getImporteIva() {
		// TODO Auto-generated method stub
		return getImporte() * 1.21;
	}

}
