package views;

import controllers.EmpleadoController;

public class EmpleadoView {
	
	public static void main(String[] args) {
		
		//Crear Empleado
		//String empleado = new EmpleadoController().createEmpleado("Himler", "Schmidt", 23, "masculino", 1800);
		
		
		//Borrar Empleado
		//String empleado = new EmpleadoController().deleteEmpleado(2);
		
		
		//Actualizar Empleado
		//String empleado = new EmpleadoController().updateEmpleado(1, "Aaron");
		
		//leer Empleado
		String empleado = new EmpleadoController().getEmpleado(1);
		System.out.print(empleado);
		
		
		
		
	
		

		
	}
}
