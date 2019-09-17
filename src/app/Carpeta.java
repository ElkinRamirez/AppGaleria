/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

public class Carpeta {
	
	String Nombre;
	ArrayList <Foto> fotos;
	public Carpeta(String nombre) {
		super();
		ArrayList <Foto> pr=new ArrayList<Foto>();
		this.Nombre = nombre;
		this.fotos = pr;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public ArrayList<Foto> getFotos() {
		return fotos;
	}
	public void addFoto(Foto f) {
		this.fotos.add(f);
	}
	public void removeFoto(Foto f) {
		for(int c=0;c<fotos.size();c++) {
			if(fotos.get(c).equals(f)) {
				fotos.remove(c);
			}
		}
	}
}