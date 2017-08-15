/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public void andar() {

		System.out.println("la persona anda");
	}
}
