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

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFecha() {
	return fecha;
}

public void setFecha(LocalDate fecha) {
	int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año"));
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
	int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
	this.fecha = fecha.of(anio, mes, dia);
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public int calcularDiasDeVacaciones(LocalDate fecha) {
	
	return 0;
}

}
