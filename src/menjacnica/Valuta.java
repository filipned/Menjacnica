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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result
				+ ((skracenoIme == null) ? 0 : skracenoIme.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (skracenoIme == null) {
			if (other.skracenoIme != null)
				return false;
		} else if (!skracenoIme.equals(other.skracenoIme))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [ime=" + ime + ", skracenoIme=" + skracenoIme
				+ ", kursevi=" + kursevi + "]";
	}
	
	
	
}
