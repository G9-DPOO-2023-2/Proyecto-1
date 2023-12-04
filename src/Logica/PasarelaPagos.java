package Logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class PasarelaPagos {
	
private HashMap<String, ArrayList<String>> PayU;
private ArrayList<String> infoNuevaParsela;
private HashMap<String, ArrayList<String>> PayPal;

public PasarelaPagos ()
{
	PayU = new HashMap<>();
	PayPal = new HashMap<>();
	infoNuevaParsela = new ArrayList<String>();
}

public HashMap<String, ArrayList<String>> getPayU() {
	return PayU;
}

public void setPayU(HashMap<String, ArrayList<String>> payU) {
	PayU = payU;
}

public HashMap<String, ArrayList<String>> getPayPal() {
	return PayPal;
}

public void setPayPal(HashMap<String, ArrayList<String>> payPal) {
	PayPal = payPal;
}

//Metodos Logicos

public void agregarDatosPasarela (String medioPago ,String nombre_completo, String cedula, String paisExpedicion, String email, String numCuenta, String numTransaccion, String monto, String seguro, String total)
	{
		
		infoNuevaParsela.add(nombre_completo);
		infoNuevaParsela.add(paisExpedicion);
		infoNuevaParsela.add(email);
		infoNuevaParsela.add(numCuenta);
		infoNuevaParsela.add(numTransaccion);
		infoNuevaParsela.add(monto);
		infoNuevaParsela.add(seguro);
		infoNuevaParsela.add(total);
		
		if (medioPago.equals("PayU"))
		{
			getPayU().put(cedula, infoNuevaParsela);
		}else if (medioPago.equals("PayPal"))
		{
			getPayPal().put(cedula, infoNuevaParsela);
		}
	}

public void agregarPagoARealizar (ClienteRegistrado nuevo_cliente, MetodoPago metodoPago ) throws IOException
{
	FileWriter file = new FileWriter ("PagoARealizar.txt", true);
	BufferedWriter br = new BufferedWriter(file);
	
	String cedula = nuevo_cliente.getCedula();
	String nombre = nuevo_cliente.getNombre();
	String email = nuevo_cliente.getEmail();
	String lugarExpedicionCC = nuevo_cliente.getPaisExpedicion();
	
	String medioPago = metodoPago.getTipoTarjeta();
	String numeroTarjeta = metodoPago.getNumeroTarjeta();
	
	br.write(System.getProperty("line.separator")+ cedula + ";" + nombre + ";"  + email + ";" + lugarExpedicionCC + ";" + medioPago + ";" + numeroTarjeta );
	br.close();
}

public void agregarNuevoPayPal (ClienteRegistrado nuevo_cliente, MetodoPago metodoPago ) throws IOException
{
	FileWriter file = new FileWriter ("PayPal.txt", true);
	BufferedWriter br = new BufferedWriter(file);
	
	String cedula = nuevo_cliente.getCedula();
	String nombre = nuevo_cliente.getNombre();
	String email = nuevo_cliente.getEmail();
	String lugarExpedicionCC = nuevo_cliente.getPaisExpedicion();
	
	String medioPago = metodoPago.getTipoTarjeta();
	String numeroTarjeta = metodoPago.getNumeroTarjeta();
	
	br.write(System.getProperty("line.separator")+ cedula + ";" + nombre + ";"  + email + ";" + lugarExpedicionCC + ";" + medioPago + ";" + numeroTarjeta );
	br.close();
}

public void agregarNuevoPayU (ClienteRegistrado nuevo_cliente, MetodoPago metodoPago ) throws IOException
{
	FileWriter file = new FileWriter ("PayU.txt", true);
	BufferedWriter br = new BufferedWriter(file);
	
	String cedula = nuevo_cliente.getCedula();
	String nombre = nuevo_cliente.getNombre();
	String email = nuevo_cliente.getEmail();
	String lugarExpedicionCC = nuevo_cliente.getPaisExpedicion();
	
	String medioPago = metodoPago.getTipoTarjeta();
	String numeroTarjeta = metodoPago.getNumeroTarjeta();
	
	br.write(System.getProperty("line.separator")+ cedula + ";" + nombre + ";"  + email + ";" + lugarExpedicionCC + ";" + medioPago + ";" + numeroTarjeta );
	br.close();
}

}
