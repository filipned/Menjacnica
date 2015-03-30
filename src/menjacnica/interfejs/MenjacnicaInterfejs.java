package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String ime, String skracenoIme,  GregorianCalendar datum, double prodajni, double srednji, double kupovni);
	public void obrisiKurs(String imeValute, GregorianCalendar datum);
	public Kurs pronadjiKurs(String imeValute, GregorianCalendar datum);
}
