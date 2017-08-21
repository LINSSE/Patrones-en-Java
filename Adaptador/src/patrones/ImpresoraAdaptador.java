/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class ImpresoraAdaptador extends Impresora {

	private ImpresoraExcel impresoraExcel;

	public ImpresoraAdaptador() {
		super();
		impresoraExcel = new ImpresoraExcel();
	}

	public void imprimir() {

		impresoraExcel.generarFichero(getTexto());

	}
}
