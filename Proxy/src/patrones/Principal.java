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

		ServicioMensaje sm = new ServicioMensajeProxy();
		System.out.println(sm.mensaje("pepito"));

	}

}
