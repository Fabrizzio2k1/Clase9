import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador empleado1 = new Trabajador();
		empleado1.setNombre("Tano Mastreani");
		empleado1.setSalario(1000);
		empleado1.setFecha(LocalDate.of(2001, 5, 21));
		JOptionPane.showMessageDialog(null, "El nombre es: " + empleado1.getNombre() + " Y gano: $" + empleado1.getSalario() + " y laburo desde: " + empleado1.getFecha());
	}

}
