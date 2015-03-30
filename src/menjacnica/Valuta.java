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
		if(ime==null || ime.isEmpty())
			throw new RuntimeException("Ime ne smije biti null ili prazan Stirng!");
		
		this.ime = ime;
	}
	public String getSkracenoIme() {
		return skracenoIme;
	}
	public void setSkracenoIme(String skracenoIme) {
		if(skracenoIme==null || skracenoIme.isEmpty())
			throw new RuntimeException("skracenoIme ne smije biti null ili prazan Stirng!");
		
		this.skracenoIme = skracenoIme;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		if(kursevi.isEmpty() || kursevi==null )
			throw new RuntimeException("Parametar kursevi ne smije biti null ili prazna lista");
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
		if(obj instanceof Valuta){
			Valuta v=(Valuta) obj;
			return v.getIme().equals(ime);
		}
		return false;
	}
	@Override
	public String toString() {
		return "Valuta [ime=" + ime + ", skracenoIme=" + skracenoIme
				+ ", kursevi=" + kursevi + "]";
	}
	
	
	
}
