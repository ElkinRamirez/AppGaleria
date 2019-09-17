/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galeria ga=new Galeria();
		int d=1;
		while(d!=0) {
			System.out.println("ingrese numero de instrucción: ");
			System.out.println("1: crear carpeta");
			System.out.println("2: borrar carpeta");
			System.out.println("3: cargar foto");
			System.out.println("4: mostrar foto");
			System.out.println("5: mover foto");
			System.out.println("6: borrar foto");
			System.out.println("7: salir");
			Scanner leer=new Scanner(System.in);
			int c=leer.nextInt();
			switch(c) {
			case 1:
				crearCarpeta(ga);
				break;
			case 2:
				borrarCarpeta(ga);
				break;
			case 3:
				cargarFoto(ga);
				break;
			case 4:
				mostrarFoto(ga);
				break;
			case 5:
				moverFoto(ga);
				break;
			case 6:
				eliminarFoto(ga);
				break;
			case 7:
				d=0;
				break;
			}
		}
	}
	
	
	public static void crearCarpeta(Galeria ga) {
		Scanner leer=new Scanner(System.in);
		System.out.println("ingrese nombre de carpeta: ");
		String Nombre=leer.next();
		Carpeta temp= new Carpeta(Nombre);
		ga.addCarpeta(temp);
	}
	public static void borrarCarpeta(Galeria ga) {
		System.out.println("carpetas creadas actualmente:");
		for(int d=0;d<ga.carpetas.size();d++) {
			System.out.println(ga.carpetas.get(d).getNombre());
		}
		if(ga.carpetas.size()==0) {
			System.out.println("no existen capetas ");
			return;
		}
		System.out.println("ingrese nombre de capreta a borrar: ");
		Scanner leer=new Scanner(System.in);
		String Nombre=leer.next();
		for(int d=0;d<ga.carpetas.size();d++) {
			if(ga.carpetas.get(d).Nombre.equals(Nombre)) {
				ga.carpetas.remove(d);
				break;
			}
		}
	}
	public static void cargarFoto(Galeria ga) {
		System.out.println("carpetas creadas actualmente:");
		for(int d=0;d<ga.carpetas.size();d++) {
			System.out.println(ga.carpetas.get(d).getNombre());
		}
		if(ga.carpetas.size()==0) {
			System.out.println("no existen capetas ");
			return;
		}
		System.out.println("ingrese nombre de carpeta en a que desea cargar: ");
		Scanner leer=new Scanner(System.in);
		String Nombre=leer.next();
		System.out.println("ingrese nombre de la foto que desea cargar: ");
		String Nombref=leer.next();
		for(int d=0;d<ga.carpetas.size();d++) {
			if(ga.carpetas.get(d).Nombre.equals(Nombre)) {
				Foto temp = new Foto (Nombref,"");
				ga.carpetas.get(d).addFoto(temp);
				break;
			}
		}

	}
	public static void mostrarFoto(Galeria ga) {
		System.out.println("carpetas creadas actualmente:");
		for(int d=0;d<ga.carpetas.size();d++) {
			System.out.println(ga.carpetas.get(d).getNombre());
		}
		if(ga.carpetas.size()==0) {
			System.out.println("no existen capetas ");
			return;
		}
		System.out.println("ingrese nombre de carpeta que desea abrir: ");
		Scanner leer=new Scanner(System.in);
		String Nombre=leer.next();
		for(int d=0;d<ga.carpetas.size();d++) {
			if(ga.carpetas.get(d).Nombre.equals(Nombre)) {
				for(int c=0;c<ga.carpetas.get(d).getFotos().size();c++) {
					System.out.println(ga.carpetas.get(d).getFotos().get(c).getNombre());
				}
				if(ga.carpetas.get(d).getFotos().size()==0) {
					System.out.println("no existen fotos en esta capeta ");
					return;
				}
				System.out.println("ingrese nombre de foto que desea abrir: ");
				String Nombref=leer.next();
				for(int c=0;c<ga.carpetas.get(d).getFotos().size();c++) {
					if(ga.carpetas.get(d).getFotos().get(c).getNombre().equals(Nombref)) {
						System.out.println(ga.carpetas.get(d).getFotos().get(c).getNombre());
						System.out.println(ga.carpetas.get(d).getFotos().get(c).getFecha());
						break;
					}
				}
				break;
			}
		}

	}
	public static void eliminarFoto(Galeria ga) {
		System.out.println("carpetas creadas actualmente:");
		for(int d=0;d<ga.carpetas.size();d++) {
			System.out.println(ga.carpetas.get(d).getNombre());
		}
		if(ga.carpetas.size()==0) {
			System.out.println("no existen capetas ");
			return;
		}
		System.out.println("ingrese nombre de carpeta que desea abrir: ");
		Scanner leer=new Scanner(System.in);
		String Nombre=leer.next();
		for(int d=0;d<ga.carpetas.size();d++) {
			if(ga.carpetas.get(d).Nombre.equals(Nombre)) {
				for(int c=0;c<ga.carpetas.get(d).getFotos().size();c++) {
					System.out.println(ga.carpetas.get(d).getFotos().get(c).getNombre());
				}
				if(ga.carpetas.get(d).getFotos().size()==0) {
					System.out.println("no existen fotos en esta capeta ");
					return;
				}
				System.out.println("ingrese nombre de foto que desea borrar: ");
				String Nombref=leer.next();
				for(int c=0;c<ga.carpetas.get(d).getFotos().size();c++) {
					if(ga.carpetas.get(d).getFotos().get(c).getNombre().equals(Nombref)) {
						ga.carpetas.get(d).getFotos().remove(c);
						break;
					}
				}
				break;
			}
		}

	}
	public static void moverFoto(Galeria ga) {
		Foto temp = new Foto(null, null);
		System.out.println("carpetas creadas actualmente:");
		for(int d=0;d<ga.carpetas.size();d++) {
			System.out.println(ga.carpetas.get(d).getNombre());
		}
		System.out.println("ingrese nombre de carpeta que desea abrir: ");
		Scanner leer=new Scanner(System.in);
		String Nombre=leer.next();
		for(int d=0;d<ga.carpetas.size();d++) {
			if(ga.carpetas.get(d).Nombre.equals(Nombre)) {
				for(int c=0;c<ga.carpetas.get(d).getFotos().size();c++) {
					System.out.println(ga.carpetas.get(d).getFotos().get(c).getNombre());
				}
				System.out.println("ingrese nombre de foto que desea mover: ");
				String Nombref=leer.next();
				for(int c=0;c<ga.carpetas.get(d).getFotos().size();c++) {
					if(ga.carpetas.get(d).getFotos().get(c).getNombre().equals(Nombref)) {
						temp=ga.carpetas.get(d).getFotos().get(c);
						ga.carpetas.get(d).getFotos().remove(c);
						break;
					}
				}
				break;
			}
		}
		
		System.out.println("carpetas creadas actualmente:");
		for(int d=0;d<ga.carpetas.size();d++) {
			System.out.println(ga.carpetas.get(d).getNombre());
		}
		System.out.println("ingrese nombre de carpeta que desea abrir: ");
		String Nombrea=leer.next();
		for(int d=0;d<ga.carpetas.size();d++) {
			if(ga.carpetas.get(d).Nombre.equals(Nombrea)) {
				ga.carpetas.get(d).addFoto(temp);
				break;
			}
		}
	}
}
