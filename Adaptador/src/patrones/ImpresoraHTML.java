/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class ImpresoraHTML extends Impresora {

	public ImpresoraHTML(String texto) {
		super();
		setTexto(texto);
	}

	public void imprimir() {

		System.out.println("fichero HTML con " + getTexto());

	}
}
