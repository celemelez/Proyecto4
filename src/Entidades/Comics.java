package Entidades;

import java.util.Date;

public abstract class Comics extends Libro {
	private String personaje;


	public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
		super(precio, fechaPublicacion, autor, titulo, editorial);
		this.personaje = personaje;
	}


	public String getPersonaje() {
		return personaje;
	}


	@Override
	public String toString() {
		return "Comics [personaje=" + personaje + "]";
	}
	

}
