package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String ime;
	private String skracenoIme;
	LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSkracenoIme() {
		return skracenoIme;
	}
	public void setSkracenoIme(String skracenoIme) {
		this.skracenoIme = skracenoIme;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	
	
}
