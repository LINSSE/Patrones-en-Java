/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Principal {

	public static void main(String[] args) {
		Factura f = FactoriaFacturas.getFactura("iva21");
		f.setId(1);
		f.setImporte(100);
		System.out.println(f.getImporteIva());

		Factura f1 = FactoriaFacturas.getFactura("iva105");
		f1.setId(2);
		f1.setImporte(100);
		System.out.println(f1.getImporteIva());
	}
}
