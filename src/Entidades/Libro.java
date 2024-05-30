package Entidades;

import java.util.Date;

public class Libro extends Producto implements ILibro {
	private Date FechaPublicacion;
	private String autor;
	private String titulo;
	private String editorial;
	
	public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
		super(precio);
		FechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}
	public Date getFechaPublicacion() {
		return FechaPublicacion;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioVenta();
	}
	@Override
	public String toString() {
		return "Libro [FechaPublicacion=" + FechaPublicacion + ", autor=" + autor + ", titulo=" + titulo
				+ ", editorial=" + editorial + "]";
	}
	 
	

}
