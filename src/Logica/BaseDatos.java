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
		private HashMap<String, List<String>> sede1;
		private HashMap<String, List<String>> sede2;
		private HashMap<String, List<String>> sede3;
		
		//**********************************************************************************
		//Constructor
		//**********************************************************************************
		
		public BaseDatos ()
		{
			empleados = new HashMap<>();
			clientesRegistrados = new HashMap<>();
			sede1 = new HashMap<>();
			sede2 = new HashMap<>();
			sede3 = new HashMap<>();
		}
		
		//Metodos OJO recomendable poner setters and getters
		
		public HashMap<String, List<String>> getEmpleados()
		{
			return empleados;
		}
		
		public void setEmpleados(HashMap<String, List<String>> empleados) {
			this.empleados = empleados;
		}

		public HashMap<String, List<String>> getClientesRegistrados() 
		{
			return clientesRegistrados;
		}
		
		public void setClientesRegistrados(HashMap<String, List<String>> clientesRegistrados) {
			this.clientesRegistrados = clientesRegistrados;
		}
		
		
		public HashMap<String, List<String>> getSede1() {
			return sede1;
		}

		public void setSede1(HashMap<String, List<String>> sede1) {
			this.sede1 = sede1;
		}

		public HashMap<String, List<String>> getSede2() {
			return sede2;
		}

		public void setSede2(HashMap<String, List<String>> sede2) {
			this.sede2 = sede2;
		}

		public HashMap<String, List<String>> getSede3() {
			return sede3;
		}

		public void setSede3(HashMap<String, List<String>> sede3) {
			this.sede3 = sede3;
		}
		
		//Metodos de Logica

		public void cargarBaseDatos(String archivoEmpleados, String archivoClientes, String archivoSede1, String archivoSede2, String archivoSede3) {
		try 
		{
			cargarEmpleados(archivoEmpleados);
			cargarClientesRegistrados(archivoClientes);
			cargarSede1(archivoSede1);
			cargarSede2(archivoSede2);
			cargarSede3(archivoSede3);
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
		
		public void cargarSede1 (String archivo)
		{
			try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(";");
	                
	                // Usar la primera parte como clave
	                String placa = partes[0];

	                // Agregar las demás partes a una lista
	                List<String> valores = new ArrayList<>();
	                for (int i = 1; i < partes.length; i++) {
	                    valores.add(partes[i]);
	                }

	                // Insertar la clave y la lista de valores en el HashMap
	                sede1.put(placa, valores);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			// Imprimir el HashMap
	        System.out.println(sede1);
		}
		
		public void cargarSede2 (String archivo)
		{
			try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(";");
	                
	                // Usar la primera parte como clave
	                String placa = partes[0];

	                // Agregar las demás partes a una lista
	                List<String> valores = new ArrayList<>();
	                for (int i = 1; i < partes.length; i++) {
	                    valores.add(partes[i]);
	                }

	                // Insertar la clave y la lista de valores en el HashMap
	                sede2.put(placa, valores);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			// Imprimir el HashMap
	        System.out.println(sede2);
		}
		
		public void cargarSede3 (String archivo)
		{
			try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(";");
	                
	                // Usar la primera parte como clave
	                String placa = partes[0];

	                // Agregar las demás partes a una lista
	                List<String> valores = new ArrayList<>();
	                for (int i = 1; i < partes.length; i++) {
	                    valores.add(partes[i]);
	                }

	                // Insertar la clave y la lista de valores en el HashMap
	                sede3.put(placa, valores);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			// Imprimir el HashMap
	        System.out.println(sede3);
		}

	}
