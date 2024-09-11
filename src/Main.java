import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador empleado1 = new Trabajador();
		empleado1.ingresarNombre();
		empleado1.ingresarSalario();
		empleado1.ingresarFecha();
		JOptionPane.showMessageDialog(null, "El nombre es: " + empleado1.getNombre() + " Y gano: $" + empleado1.getSalario() + " y laburo desde: " + empleado1.verFecha() + " Tengo: " + empleado1.calcularDiasDeVacaciones() + " dias de vacaciones" + "El aumento salarial de: " + empleado1.getNombre() + " es de: $" + empleado1.calcularAumentoSalarial() + " La idemnización es de: "+empleado1.calcularIndemnizacionDespido());
	}

}
