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

		/**
		 * System.out.println(c.getMotor().getPotencia()); Se reemplaza por
		 * System.out.println(c.getPotencia()); Gracias a la Delegacion de metodos se
		 * puede acceder a la potencia directamente desde el objeto Coche como un metodo
		 * propio.
		 */
		System.out.println(c.getPotencia());

	}
}
