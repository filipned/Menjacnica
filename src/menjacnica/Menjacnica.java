package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
		
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(String ime, String skracenoIme,
			GregorianCalendar datum, double prodajni, double srednji,
			double kupovni) {
		
	}

	@Override
	public void obrisiKurs(String imeValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronadjiKurs(String imeValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
