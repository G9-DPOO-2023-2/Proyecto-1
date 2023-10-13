package Logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseDatos 
{
	/**
	 * Aca van a ir todas las funciones relacionadas con la carga de datos de cada uno de los 
	 * datos encontrados en el txt de los empleados y clientesRegistrados.
	 */
	//*******************************************************************************
		//Atributos
		//*******************************************************************************
		
		private HashMap<String, List<String>> empleados;
		private HashMap<String, List<String>> clientesRegistrados;
		
		//**********************************************************************************
		//Constructor
		//**********************************************************************************
		
		public BaseDatos ()
		{
			empleados = new HashMap<>();
			clientesRegistrados = new HashMap<>();
		}
		
		//Metodos OJO recomendable poner setters and getters
		
		public HashMap<String, List<String>> getEmpleados()
		{
			return empleados;
		}

		public HashMap<String, List<String>> getClientesRegistrados() 
		{
			return clientesRegistrados;
		}
		
		//Metodos de Logica
		
		
		public void cargarBaseDatos(String archivoEmpleados, String archivoClientes) {
		try 
		{
			cargarEmpleados(archivoEmpleados);
			cargarClientesRegistrados(archivoClientes);
		}catch (Exception e) {

		}
		
	}
		
		/**
		 * Cada una de estas funciones carga los txt de los vehiculos y los almacena en cada 
		 * uno de los HashMap respectivamente (dependiendo de su categoria)
		 * @param archivo
		 */
		public void cargarEmpleados (String archivo)
		{
			try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(";");
	                
	                // Usar la primera parte como clave
	                String cedula = partes[0];

	                // Agregar las demás partes a una lista
	                List<String> valores = new ArrayList<>();
	                for (int i = 1; i < partes.length; i++) {
	                    valores.add(partes[i]);
	                }

	                // Insertar la clave y la lista de valores en el HashMap
	                empleados.put(cedula, valores);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Imprimir el HashMap
	        System.out.println(empleados);
	    }
		
		public void cargarClientesRegistrados (String archivo)
		{
			try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(";");
	                
	                // Usar la primera parte como clave
	                String cedula = partes[0];

	                // Agregar las demás partes a una lista
	                List<String> valores = new ArrayList<>();
	                for (int i = 1; i < partes.length; i++) {
	                    valores.add(partes[i]);
	                }

	                // Insertar la clave y la lista de valores en el HashMap
	                clientesRegistrados.put(cedula, valores);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Imprimir el HashMap
	        System.out.println(clientesRegistrados);
	    }
		
		//*********************************************************************
		//Getters and Setters
		//*********************************************************************
		
		public void setEmpleados(HashMap<String, List<String>> empleados) {
			this.empleados = empleados;
		}

		public void setClientesRegistrados(HashMap<String, List<String>> clientesRegistrados) {
			this.clientesRegistrados = clientesRegistrados;
		}

	}
