/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

public class Galeria {
	ArrayList <Carpeta> carpetas;
	public Galeria() {
		super();
		ArrayList <Carpeta> pr=new ArrayList<Carpeta>();
		this.carpetas = pr;
	}
	public void addCarpeta(Carpeta f) {
		this.carpetas.add(f);
	}
	public void removeCarpeta(Foto f) {
		for(int c=0;c<carpetas.size();c++) {
			if(carpetas.get(c).equals(f)) {
				carpetas.remove(c);
			}
		}
	}
	public void move(Foto f, Carpeta destino) {
		
	}
}
