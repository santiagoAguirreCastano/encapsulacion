package tallerEncapsulación;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto("Manzanas", 3500.0, 45));
		listaProductos.add(new Producto("Papas Margarita", 6500.0, 45));
		listaProductos.add(new Producto("Gaseosa Postobon", 6500.0, 45));
		
		for(Producto emp: listaProductos) {
			emp.mostrarProducto();
			System.out.println("----------------");
		}
		
		listaProductos.get(1).setCantidadStock(70);
		
		listaProductos.remove(2);
		
		System.out.println("\nProductos Actualizados\n----------------");
		
		for(Producto emp: listaProductos) {
			emp.mostrarProducto();
			System.out.println("----------------");
		}
		
		String busquedaProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto que deseas encontrar: ");
		
		boolean productoEncontrado= false;
		
		for(Producto nombreProducto : listaProductos) {
			if(nombreProducto.getNombre().equals(busquedaProducto)) {
				System.out.println("\nEl producto ha sido encontrado\n");
				nombreProducto.mostrarProducto();
				productoEncontrado = true;
				break;
			}
		}
			
		
		if(!productoEncontrado) {
			System.out.println("El producto no existe");
		}
		}
	}

