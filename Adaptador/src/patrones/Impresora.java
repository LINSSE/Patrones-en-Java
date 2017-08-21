/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public abstract class Impresora {

	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public abstract void imprimir();
}
