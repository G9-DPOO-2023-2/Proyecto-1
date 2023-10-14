package Logica;

import java.util.ArrayList;
import java.util.HashMap;

public class MetodoPago {
	
	String nombre;
	String apellido;
	String codigoDeSeguridad;
	String codigoTarjeta;
	HashMap<String, ArrayList<String>> infoMP;
	
	public MetodoPago(String nombre, String apellido, String codigoDeSeguridad, String codigoTarjeta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.codigoTarjeta = codigoTarjeta;
	}

	public void agregarInfoTarjeta(String nombre, String apellido, String codigoDeSeguridad, String codigoTarjeta) {
		
		this.infoMP = new HashMap<String, ArrayList<String>>();
		ArrayList<String> listaInfo = new ArrayList<String>();
		
		listaInfo.add(nombre);
		listaInfo.add(apellido);
		listaInfo.add(codigoDeSeguridad);
		
		infoMP.put(codigoTarjeta, listaInfo);
	}

}
