package Presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
	public static void main(String[] args) 
	{
		Categoria x = new Categoria();
		x.cargarVehiculos("vehiculos.txt");
		System.out.println(x);
		
		BaseDatos y = new BaseDatos();
		y.cargarEmpleados("empleados.txt");
		System.out.println(y);
		
		y.cargarClientesRegistrados("ClientesRegistrados.txt");
		System.out.println(y);
	}
}
