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
		Coche c = new Coche();
		c.setMarca("toyota");
		Motor m = new Motor();
		m.setCilindros(6);
		m.setPotencia(100);
		c.setMotor(m);

		System.out.println(c.getMotor().getPotencia());

	}
}
