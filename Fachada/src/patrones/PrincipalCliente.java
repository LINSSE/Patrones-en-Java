/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class PrincipalCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpresoraNormal fachada1 = new ImpresoraNormal("texto1");
		fachada1.imprimir();

		ImpresoraNormal fachada2 = new ImpresoraNormal("texto2");
		fachada2.imprimir();

		Impresora i3 = new Impresora();
		i3.setHoja("a4");
		i3.setColor(true);
		i3.setTipoDocumento("excel");
		i3.setTexto("texto 3");
		i3.imprimirDocumento();
	}

}
