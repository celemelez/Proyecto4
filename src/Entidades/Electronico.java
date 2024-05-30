package Entidades;

public abstract class Electronico extends Producto implements IElectronica{
	private String fabricante;

	 
	
	public Electronico(int precio, String fabricante) {
		super(precio);
		this.fabricante = fabricante;
	}



	public String getFabricante() {
		return fabricante;
	}



	@Override
	public String toString() {
		return "Electronico [fabricante=" + fabricante + "]";
	}
	

}
