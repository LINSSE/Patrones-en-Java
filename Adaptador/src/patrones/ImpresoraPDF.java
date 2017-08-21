/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class ImpresoraPDF extends Impresora {

	public ImpresoraPDF(String texto) {
		super();
		setTexto(texto);
	}

	public void imprimir() {

		System.out.println("fichero pdf con " + getTexto());

	}
}
