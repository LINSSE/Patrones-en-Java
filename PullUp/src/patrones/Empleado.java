/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Empleado extends Persona {

	private String trabajo;

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public void andar() {
		System.out.println("la persona anda");
	}
}
