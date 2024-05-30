package Entidades;

public abstract class Producto implements IProducto{
	private int precio;

	public Producto(int precio) {
		super();
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + "]";
	}
	

	
	

}
