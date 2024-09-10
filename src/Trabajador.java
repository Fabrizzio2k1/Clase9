import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Trabajador {
//Atributos	
private String nombre;
private LocalDate fecha;
private double salario;

//Constructor
public Trabajador() {
	this.nombre = "Default";
	this.fecha = fecha.now();
	this.salario = 0;
}

//Getters y Setters

public String getNombre() {
	return nombre;
}

public void ingresarNombre() {
	nombre = JOptionPane.showInputDialog("Ingrese el nombre del trabajador: ");
}

public LocalDate getFecha() {
	return fecha;
}

public void ingresarFecha() {
	int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año"));
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
	int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
	fecha = LocalDate.of(anio, mes, dia);
}

public double getSalario() {
	return salario;
}

public void ingresarSalario() {
	do {
		salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del trabajador: "));
	} while (salario <= 0);
	
}

public int calcularDiasDeVacaciones(LocalDate fecha) {
	
	return 0;
}

}
