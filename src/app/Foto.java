/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Date;

public class Foto {
	String Nombre;
	String Origen;
	Date Fecha;
	public Foto(String nombre, String origen) {
		super();
		this.Nombre = nombre;
		this.Origen = origen;
		this.Fecha = new Date();
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getOrigen() {
		return Origen;
	}
	public void setOrigen(String origen) {
		Origen = origen;
	}
	public Date getFecha() {
		return Fecha;
	}
	
}
