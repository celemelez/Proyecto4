package Utilidades;
import Entidades.Tvlcd;

import java.util.Date;

import Entidades.IProducto;
import Entidades.Iphone;
import Entidades.Libro;
import Entidades.Producto;

public class ProyectoCatalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProducto[] producto = new Producto[6];
		producto[0] = new Iphone(2313213,"Apple","6s", "rosa");
		producto[1] = new Iphone(4534, "Apple", "once pro", "dorado");
		producto[2] = new Tvlcd (24000, "Philips", 40);
		producto[3] = new Tvlcd (50000, "Samsung", 60);
		producto[4] = new Libro (18000, new Date(),"Lauti Rojas", "Harry Potter", "Noseee...");
		producto[5] = new Libro(14000, new Date(), "Julian Macri", "El principito", "Cosita...");
		
		   for (int i = 0; i < 6; i++) {
	            System.out.print(producto[i].toString());
	        }

	}

}
