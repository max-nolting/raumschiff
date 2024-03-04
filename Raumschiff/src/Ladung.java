/**
 * Objekt zum Darstellen eines Stücks Ladung auf einem Raumschiff.
 * @see Raumschiff
 * @author Max Nolting
 * */
public class Ladung {
	/** Art der Ladung */
	private String bezeichnung;
	/** Menge der Ladung */
	private int menge;
	/**
	 * getter-Methode für das Attribut bezeichnung
	 * @return bezeichnung
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}
	/**
	 * setter-Methode für das Attribut bezeichnung
	 * @param bezeichnung
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	/**
	 * getter-Methode für das Attribut menge
	 * @return menge
	 */
	public int getMenge() {
		return menge;
	}
	/** setter-Methode für das Attribut menge */
	public void setMenge(int menge) {
		this.menge = menge;
	}
	
	/**
	 * unparametrisierter Konstruktor für die Klasse Ladung
	 */
	public Ladung() 
	{
		bezeichnung = "";
		menge = 0;
	}
	/**
	 * vollparametrisierter Konstruktor für die Klasse Ladung
	 * @param bezeichnung
	 * @param menge
	 */
	public Ladung(String bezeichnung, int menge) {
		this.bezeichnung = bezeichnung;
		this.menge = menge;
	}
	/**
	 * Override für die toString-Methode. Formatiert String als "Menge Bezeichnung"
	 */
	@Override
	public String toString() 
	{
		return menge + " " + bezeichnung;
	}
}
