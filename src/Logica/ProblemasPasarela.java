package Logica;

public class ProblemasPasarela extends Exception{
	private int codigo;
	
	public static final int NO_SALDO = 1;
	public static final int NUM_CUENTA = 2;
	public static final int NUM_CEDULA = 3;
	public static final int NOM_CLIENTE = 4;
	public static final int ESTADO_TARJETA = 5;
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public ProblemasPasarela(int codigo) {
		this.codigo = codigo;
	}


}
