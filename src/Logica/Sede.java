package Logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Sede 
{
	//****************************************************************************
	//Atributos
	//****************************************************************************
	
	private ArrayList<String> infoSede1;
	private ArrayList<String> infoSede2;
	private ArrayList<String> infoSede3;
	
	/**
	 * Es el horario que todas las sedes manejan, es el mismo para todas.
	 */
	
	private String horario;
	
	/**
	 * Es el nombre que se le da a cada una de las sedes para poderla identificar
	 */
	
	private String nombre;
	
	/**
	 * Es la dirección especifica donde se encuentra la sede seleccionada
	 */
	
	private String ubicacion;

	//*********************************************************************************
	//Constructor
	//*********************************************************************************
	/*Construye una sede e inicializa los atributos de este con la 
	 * información entrada por parametro
	 * 
	 * @param horario - Es el horario que todas las sedes manejan por igual
	 * @param nombre - Es el nombre de la sede
	 * @param ubicación - Es la ubicacion especifica de la sede escogida
	 */
	public Sede(String horario, String nombre, String ubicacion) 
	{
		super();
		this.horario = horario;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		infoSede1 = new ArrayList<String>();
		infoSede2 = new ArrayList<String>();
		infoSede3 = new ArrayList<String>();
	}

	
	//************************************************************************************
	//Metodos para acceder a los atributos (Getters and Setters)
	//************************************************************************************
	
	/**
	 * @return lel horario que manejan todas las sedes (es el mismo)
	 */
	public String getHorario() 
	{
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @return el nombre de la sede consultada
	 */
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return la ubicacion de la sede consultada
	 */
	public String getUbicacion() 
	{
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	/**
	 * Getters and Setters de cada uno de los ArrayList
	 * @return
	 */

	public ArrayList<String> getInfoSede1() {
		return infoSede1;
	}


	public void setInfoSede1(ArrayList<String> infoSede1) {
		this.infoSede1 = infoSede1;
	}


	public ArrayList<String> getInfoSede2() {
		return infoSede2;
	}


	public void setInfoSede2(ArrayList<String> infoSede2) {
		this.infoSede2 = infoSede2;
	}


	public ArrayList<String> getInfoSede3() {
		return infoSede3;
	}


	public void setInfoSede3(ArrayList<String> infoSede3) {
		this.infoSede3 = infoSede3;
	}
	

	//**************************************************************
	//Metodos Especificos
	//**************************************************************
	
	public void cargarInformacionSedes(String archivoInfoSede1, String archivoInfoSede2, String archivoInfoSede3) {
	try {
		leerArchivoInfoSede1(archivoInfoSede1);
		leerArchivoInfoSede2(archivoInfoSede2);
		leerArchivoInfoSede3(archivoInfoSede3);
		}catch (Exception e) {

		}
	}

	public void leerArchivoInfoSede1(String archivo)
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				String nombre = partes[0];
				String valor = partes[1];

				infoSede1.add(nombre);
				infoSede1.add(valor);

			}

			br.close();
		} catch (Exception e) {

		}
	}
	
	public void leerArchivoInfoSede2(String archivo)
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				String nombre = partes[0];
				String valor = partes[1];

				infoSede2.add(nombre);
				infoSede2.add(valor);

			}

			br.close();
		} catch (Exception e) {
		}
		}
	
	public void leerArchivoInfoSede3(String archivo)
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				String nombre = partes[0];
				String valor = partes[1];

				infoSede3.add(nombre);
				infoSede3.add(valor);

			}

			br.close();
		} catch (Exception e) {
		}
	}
}
