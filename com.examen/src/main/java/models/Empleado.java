package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")

public class Empleado {
	@Id
	@Column(name="idEmpleado")
	private int idEmpleado;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="edad")
	private int edad;
	@Column(name="sexo")
	private String sexo;
	@Column(name="salario")
	private int salario;
	
	

	
	public Empleado() {
	}
	
	public Empleado(String nombres, String apellidos, int edad, String sexo, int salario) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	

}
