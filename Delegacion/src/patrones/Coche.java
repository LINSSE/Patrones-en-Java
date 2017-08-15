/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Coche {

	private String marca;
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Metodo agregado mediante la aplicacion de Delegacion
	public int getPotencia() {
		return motor.getPotencia();
	}

	// Metodo agregado mediante la aplicacion de Delegacion
	public void setPotencia(int potencia) {
		motor.setPotencia(potencia);
	}

	// Metodo agregado mediante la aplicacion de Delegacion
	public int getCilindros() {
		return motor.getCilindros();
	}

	// Metodo agregado mediante la aplicacion de Delegacion
	public void setCilindros(int cilindros) {
		motor.setCilindros(cilindros);
	}

}
