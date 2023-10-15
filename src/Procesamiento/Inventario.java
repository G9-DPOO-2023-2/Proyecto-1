package Procesamiento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Logica.BaseDatos;
import Logica.Vehiculo;

public class Inventario 
{
	//*****************************************************************
	//Atributos
	//*****************************************************************
	
	BaseDatos basedatos;
	Vehiculo vehiculo;
	
	//**********************************************************************
	//Constructor
	//**********************************************************************
	public Inventario(BaseDatos basedatos, Vehiculo carritos) 
	{
		super();
		this.basedatos = basedatos;
		this.vehiculo = carritos;
	}
	
	//******************************************************************
	//Metodos
	//******************************************************************
	
	public void agregarCarroNuevo(Vehiculo carro_nuevo)throws IOException
	{
		FileWriter file = new FileWriter ("vehiculos.txt", true);
		BufferedWriter br = new BufferedWriter(file);
		
		String placa = carro_nuevo.getPlaca();
		String marca = carro_nuevo.getMarca();
		String modelo = carro_nuevo.getModelo();
		String ano = carro_nuevo.getAno();
		String color = carro_nuevo.getColor();
		String transmision = carro_nuevo.getTransmision();
		String ubicacion = carro_nuevo.getUbicacion();
		String enUso = carro_nuevo.isAlquilado();
		String estado = carro_nuevo.getEstado();
		String tipo = carro_nuevo.getTipo();
		
		br.write("\n" + placa + ";" + marca + ";" + modelo + ";" + ano + ";" + color + ";" + transmision + ";"
				+ ubicacion + ";" + enUso + ";" + estado + ";" + tipo);
		br.close();
	}
	
	public void agregarCarroNuevoSede1(Vehiculo carro_nuevo)throws IOException
	{
		FileWriter file = new FileWriter ("sede1.txt", true);
		BufferedWriter br = new BufferedWriter(file);
		
		String placa = carro_nuevo.getPlaca();
		String marca = carro_nuevo.getMarca();
		String modelo = carro_nuevo.getModelo();
		String ano = carro_nuevo.getAno();
		String color = carro_nuevo.getColor();
		String transmision = carro_nuevo.getTransmision();
		String ubicacion = carro_nuevo.getUbicacion();
		String enUso = carro_nuevo.isAlquilado();
		String estado = carro_nuevo.getEstado();
		String tipo = carro_nuevo.getTipo();
		
		br.write("\n" + placa + ";" + marca + ";" + modelo + ";" + ano + ";" + color + ";" + transmision + ";"
				+ ubicacion + ";" + enUso + ";" + estado + ";" + tipo);
		br.close();
	}
	
	public void agregarCarroNuevoSede2(Vehiculo carro_nuevo)throws IOException
	{
		FileWriter file = new FileWriter ("sede2.txt", true);
		BufferedWriter br = new BufferedWriter(file);
		
		String placa = carro_nuevo.getPlaca();
		String marca = carro_nuevo.getMarca();
		String modelo = carro_nuevo.getModelo();
		String ano = carro_nuevo.getAno();
		String color = carro_nuevo.getColor();
		String transmision = carro_nuevo.getTransmision();
		String ubicacion = carro_nuevo.getUbicacion();
		String enUso = carro_nuevo.isAlquilado();
		String estado = carro_nuevo.getEstado();
		String tipo = carro_nuevo.getTipo();
		
		br.write("\n" + placa + ";" + marca + ";" + modelo + ";" + ano + ";" + color + ";" + transmision + ";"
				+ ubicacion + ";" + enUso + ";" + estado + ";" + tipo);
		br.close();
	}
	
	public void agregarCarroNuevoSede3(Vehiculo carro_nuevo)throws IOException
	{
		FileWriter file = new FileWriter ("sede3.txt", true);
		BufferedWriter br = new BufferedWriter(file);
		
		String placa = carro_nuevo.getPlaca();
		String marca = carro_nuevo.getMarca();
		String modelo = carro_nuevo.getModelo();
		String ano = carro_nuevo.getAno();
		String color = carro_nuevo.getColor();
		String transmision = carro_nuevo.getTransmision();
		String ubicacion = carro_nuevo.getUbicacion();
		String enUso = carro_nuevo.isAlquilado();
		String estado = carro_nuevo.getEstado();
		String tipo = carro_nuevo.getTipo();
		
		br.write("\n" + placa + ";" + marca + ";" + modelo + ";" + ano + ";" + color + ";" + transmision + ";"
				+ ubicacion + ";" + enUso + ";" + estado + ";" + tipo);
		br.close();
	}
}
