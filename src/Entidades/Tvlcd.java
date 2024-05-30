package Entidades;

public  class Tvlcd extends Electronico implements IElectronica{
	private int pulgada;

	

	public Tvlcd(int precio, String fabricante, int pulgada) {
		super(precio, fabricante);
		this.pulgada = pulgada;
	}


	


	public int getPulgada() {
		return pulgada;
	}





	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioVenta();
	}





	@Override
	public String toString() {
		return "Tvlcd [pulgada=" + pulgada + "]";
	}
	

}
