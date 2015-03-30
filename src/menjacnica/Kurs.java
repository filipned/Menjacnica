package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	
	private double prodajni;
	private double srednji;
	private double kupovni;
	private GregorianCalendar datum;
	
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni < 0)
			throw new RuntimeException("Prodajni kurs mora biti veci od nule.");
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji < 0)
			throw new RuntimeException("Srednji kurs mora biti veci od nule.");
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni < 0)
			throw new RuntimeException("Kupovni kurs mora biti veci od nule.");
		this.kupovni = kupovni;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum == null || datum.after(new GregorianCalendar()))
			throw new RuntimeException("Datum ne smije biti null ili datum u buducnosti!");
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Kurs){
			Kurs k=(Kurs) obj;
			return k.getKupovni()==kupovni &&
				 	k.getProdajni()==prodajni &&
				 		k.getSrednji()==srednji;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Kurs [prodajni=" + prodajni + ", srednji=" + srednji
				+ ", kupovni=" + kupovni + ", datum=" + datum + "]";
	}
	
	
	
	
}
