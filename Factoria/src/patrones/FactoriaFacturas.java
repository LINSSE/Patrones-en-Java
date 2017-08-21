/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class FactoriaFacturas {

	public static Factura getFactura(String tipo) {

		if (tipo.equals("iva21")) {
			return new FacturaIva();

		} else if (tipo.equals("iva105")) {
			return new FacturaIvaReducido();
		} else {
			return null;
		}

	}
}
