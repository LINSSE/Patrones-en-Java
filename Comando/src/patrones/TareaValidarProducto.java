/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class TareaValidarProducto implements TareaProducto {

	public void ejecutar(Producto producto) {
		if (producto.getPrecio() <= 100) {

			System.out.println("producto valido");
		} else {

			System.out.println("producto invalido");
		}

	}
}
