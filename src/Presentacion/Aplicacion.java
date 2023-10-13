package Presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Logica.AdminGeneral;
import Logica.AdminLocal;
import Logica.Categoria;
import Logica.ClienteRegistrado;
import Logica.Empleado;
import Logica.Sede;
import Logica.Vehiculo;
import Logica.BaseDatos;

public class Aplicacion 
{
	private Categoria categoria;
	private BaseDatos baseDatos;
	private ClienteRegistrado cliente;
	private HashMap<String, List<String>> clientes;
	private HashMap<String, List<String>> empleados;
	

	public Aplicacion()
	{
		categoria = new Categoria ();
		baseDatos = new BaseDatos();
		cliente = new ClienteRegistrado(null, 0, 0, null, 0, null, null, null);

		baseDatos.cargarBaseDatos("empleados.txt", 
								  "ClientesRegistrados.txt",
								  "sede1.txt",
								  "sede2.txt",
								  "sede3.txt");
		categoria.cargarFlotilla("vehiculos.txt");
		
		clientes = baseDatos.getClientesRegistrados();
		empleados = baseDatos.getEmpleados();

	}

	/**
	 * Ejecuta la aplicación: le muestra el menú al usuario y la pide que ingrese
	 * una opción, y ejecuta la opción seleccionada por el usuario. Este proceso se
	 * repite hasta que el usuario seleccione la opción de abandonar la aplicación.
	 */
	public void ejecutarAplicacion()
	{
		System.out.println("\nOpciones sobre el menu");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if(opcion_seleccionada == 1)
					ejecutarInicioSesion();
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 * 
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Iniciar Sesión");
		System.out.println("2. Crear Cuenta");
	}

	public void ejecutarInicioSesion()
	{
		System.out.println("¿Como desearia iniciar sesión?");
		System.out.println("1. Cliente");
		System.out.println("2. AdminGeneral");
		System.out.println("3. AdminLocal");
		System.out.println("4. Empleados");

		int opcion_seleccionada = Integer.parseInt(input("\nPor favor seleccione una opción"));

		if(opcion_seleccionada == 1)
		{
			String usuario = input("Por favor ingrese su usuario ");
			String contraseña = input ("Por favor ingrese su contraseña ");
			
			List<String> infoUsuario = clientes.get(usuario);
			int tamanio = infoUsuario.size();
			String actual = null;
			Boolean encontro = false;
			if(clientes.containsKey(usuario))
			{
				for(int i = 0; i < tamanio && encontro == false; i++)
				{
					actual = infoUsuario.get(i); 
					if(actual.equals(contraseña))
					{
						System.out.println("\nA. Reservar Vehiculo");
						System.out.println("\nB. Alquilar Vehiculo");
						System.out.println("\nC. Agregar conductor Adicional");

						String opcion = input("\nPor favor seleccione una opción");
						if(opcion.equals("A")) {
							reservarVehiculo();
						}
						else if(opcion.equals("B")) {
							alquilarVehiculo();
						}
						else if(opcion.equals("C")) {
							agregarConductorAdicional();
						}
						
					}
					
				}
				
			}
			else
			{
				System.out.println("No se encontro el usuario ingresado :(");
			}
		} 
		
		else if (opcion_seleccionada == 2)
		{
			String usuario = input("Por favor ingrese su usuario, no se le olvide que para validar que es adminGeneral"
					+ " debe poner un 1 al final de su Cedula (username) ");
			String contraseña = input ("Por favor ingrese su contraseña ");
			
			List<String> infoEmpleados = empleados.get(usuario);
			int tamanio = infoEmpleados.size();
			String actual = null;
			Boolean encontro = false;
			if(empleados.containsKey(usuario))
			{
				for(int i = 0; i < tamanio && encontro == false; i++)
				{
					actual = infoEmpleados.get(i); 
					if(actual.equals(contraseña))
					{
						System.out.println("\nA. Registrar Compra Nuevos Vehiculos");
						System.out.println("\nB. Dar de Baja a un Vehiculo");
						System.out.println("\nC. Validar Ubicacion");
						System.out.println("\nD. Gestionar Sede");

						String opcion = input("\nPor favor seleccione una opción");
						if(opcion.equals("A")) {
							registrarCompraNuevosVehiculos();
						}
						else if(opcion.equals("B")) {
							darBajaVehiculo();
						}
						else if(opcion.equals("C")) {
							ubicacion();
						}
						else if (opcion.equals("D")) {
							gestionarSede();
						}
					}
					
				}
				
			}
			else
			{
				System.out.println("No se encontro el usuario ingresado :(");
			}
		}
		
		else if (opcion_seleccionada == 3)
		{
			String usuario = input("Por favor ingrese su usuario, no se le olvide que para validar que es adminLocal"
					+ " debe poner un 2 al final de su Cedula (username) ");
			String contraseña = input ("Por favor ingrese su contraseña ");
			
			List<String> infoEmpleados = empleados.get(usuario);
			int tamanio = infoEmpleados.size();
			String actual = null;
			Boolean encontro = false;
			if(empleados.containsKey(usuario))
			{
				for(int i = 0; i < tamanio && encontro == false; i++)
				{
					actual = infoEmpleados.get(i); 
					if(actual.equals(contraseña))
					{
						System.out.println("\nA. Registrar Empleados");
						System.out.println("\nB. Gestionar Informacion Empleados");
						System.out.println("\nC. Crear Usuarios");
						

						String opcion = input("\nPor favor seleccione una opción");
						if(opcion.equals("A")) {
							registrarEmpleado();
						}
						else if(opcion.equals("B")) {
							gestionarInfoEmpleados();
						}
						else if(opcion.equals("C")) {
							crearUsuarios();
						}
					}
					
				}
				
			}
			else
			{
				System.out.println("No se encontro el usuario ingresado :(");
			}
		}
		
		else if (opcion_seleccionada == 4)
		{
			String usuario = input("Por favor ingrese su usuario, no se le olvide que para validar que es Empleado"
					+ " debe poner un 3 al final de su Cedula (username) ");
			String contraseña = input ("Por favor ingrese su contraseña ");
			
			List<String> infoEmpleados = empleados.get(usuario);
			int tamanio = infoEmpleados.size();
			String actual = null;
			Boolean encontro = false;
			if(empleados.containsKey(usuario))
			{
				for(int i = 0; i < tamanio && encontro == false; i++)
				{
					actual = infoEmpleados.get(i); 
					if(actual.equals(contraseña))
					{
						System.out.println("\nA. Entrega Vehiculo");
						System.out.println("\nB. Devolucion Vehiculo");
						System.out.println("\nC. Registro Conductor Adicional");
						System.out.println("\nD. Actualizar Estado Vehiculo");

						String opcion = input("\nPor favor seleccione una opción");
						if(opcion.equals("A")) {
							entregaVehiculo();
						}
						else if(opcion.equals("B")) {
							devolucionVehiculo();
						}
						else if(opcion.equals("C")) {
							registroConductorAdicional();
						}
						else if(opcion.equals("D")) {
							actualizarEstadoVehiculo();
						}
					}
					
				}
				
			}
			else
			{
				System.out.println("No se encontro el usuario ingresado :(");
			}
		}

	}

	/**
	 * Funciones relacionadas al cliente 
	 */

	public void reservarVehiculo()
	{
		System.out.println("\n Por favor sigue las siguientes instrucciones para realizar la reserva ");
		
		String categoriaCarro = input("\n Por favor ingrese la categoria que desea (suv, deportivo, lujo, pequeño o vans ) ");
		String sede = input("\n En que sede desea realizar la reserva (sede1, sede2 o sede3)");
		String fechaPickUp = input ("\n Cuando recogeria el vehiculo (día-mes-año)");
		String sedeDevolucion = input ("\n En que sede realizara la devolucion (sede1, sede2 o sede3)");
		String fechaDevolucion = input ("\n En que fecha realizara la devolucion (día-mes-año)");
		
		cliente.reservarVehiculo(categoriaCarro, sede, fechaPickUp, fechaDevolucion, sedeDevolucion);
		
		System.out.println("\n Se ha realizado su reserva y se le realizo un cobro del 30% sobre " + "\n la tarifa calculada"); 
		
	}

	public void alquilarVehiculo()
	{

	}

	public void agregarConductorAdicional()
	{
		System.out.println("HolaMundo!");
	}

	/**
	 * Funciones relacionadas con el AdminGerenal	
	 */
	
	public void registrarCompraNuevosVehiculos()
	{
		
	}
	
	public void darBajaVehiculo()
	{
		
	}
	
	public void ubicacion()
	{
		
	}
	
	public void gestionarSede()
	{
		
	}

	/**
	 * Funciones relacionadas con los AdminLocales
	 */

	public void registrarEmpleado()
	{
		
	}
	
	public void gestionarInfoEmpleados()
	{
		
	}
	
	public void crearUsuarios()
	{
		
	}

	/**
	 *Funciones relacionadas con los empleados 
	 */
	
	public void entregaVehiculo()
	{
		
	}

	public void devolucionVehiculo()
	{
		
	}

	public void registroConductorAdicional()
	{
		
	}

	public void actualizarEstadoVehiculo()
	{
		
	}



	/**
	 * Este método sirve para imprimir un mensaje en la consola pidiéndole
	 * información al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrará al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 */
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}
}
