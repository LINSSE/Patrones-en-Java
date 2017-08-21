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
		Impresora i = new ImpresoraHTML("HTML");
		i.imprimir();

		Impresora i1 = new ImpresoraPDF("PDF");
		i1.imprimir();

		Impresora i2 = new ImpresoraAdaptador();
		i2.imprimir();
	}
}
