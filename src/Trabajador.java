import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Trabajador {
//Atributos	
private String nombre;
private LocalDate fecha;
private double salario;
private int vacaciones;

//Constructor
public Trabajador() {
	this.nombre = "Default";
	this.fecha = LocalDate.now();
	this.salario = 0;
	this.vacaciones = 0;
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
	int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año que ingreso: "));
	fecha = LocalDate.ofYearDay(anio, 1);
}

public double getSalario() {
	return salario;
}

public void ingresarSalario() {
	do {
		salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del trabajador: "));
	} while (salario <= 0);
	
}

public int calcularDiasDeVacaciones() {
	LocalDate fechaActual = LocalDate.now();
	for (int i = 0; i < ( fechaActual.getYear() - fecha.getYear()); i++) {
		vacaciones += 7;
	}
	;
	return vacaciones;
}

public int calcularAumentoSalarial() {
	LocalDate fechaActual = LocalDate.now();
	int salarioAumento = (int) salario;
	for (int i = 0; i < ( fechaActual.getYear() - fecha.getYear()); i++) {
		salarioAumento += 1000;
	}
	;
	return salarioAumento;
}

public int calcularIndemnizacionDespido(){
	LocalDate fechaActual = LocalDate.now();
	int salarioIndeminizacion = 0;
	int experiencia =  fechaActual.getYear() - fecha.getYear();
	salarioIndeminizacion = (int) (salario * experiencia);
	;
	return salarioIndeminizacion;
}

}
