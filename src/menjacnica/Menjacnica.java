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
		Kurs k = new Kurs(prodajni, srednji, kupovni, datum);
		Valuta v = new Valuta(ime, skracenoIme);
		if(valute.contains(v)) {				//provjeravamo da li lista valuta vec sadrzi zadatu valutu
			if(!(v.getKursevi().contains(k)))   //ako zadata valuta postoji, provjeravamo da li u kursevima te valute vec postoji zadati kurs
				v.getKursevi().add(k);			//ako ne postoji, dodajemo ga u listu kurseva
			else
				return;							//u suprotnom metoda ne radi nista, jer kurs valute na odredjeni datum vec postoji u listi
		} else {								//ako valuta ne postoji u listi valuta
			valute.add(v);						//dodajemo je u listu valuta
			v.getKursevi().add(k);				//a zatim u listu kurseva unijete valute unosimo zadati kurs
		}
	}

	@Override
	public void obrisiKurs(String imeValute, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getIme().equals(imeValute)) {
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						valute.get(i).getKursevi().remove(valute.get(i).getKursevi().get(j));
						return;
					}
				}
			}
		}
		
	}

	@Override
	public Kurs pronadjiKurs(String imeValute, GregorianCalendar datum) {
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getIme().equals(imeValute)) {
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						return valute.get(i).getKursevi().get(j);
					}
				}
			}
		}
		return null;
	}

	
}
