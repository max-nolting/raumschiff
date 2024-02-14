
public class Ladung {
	private String bezeichnung;
	private int menge;
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getMenge() {
		return menge;
	}
	public void setMenge(int menge) {
		this.menge = menge;
	}
	
	public Ladung() 
	{
		bezeichnung = "";
		menge = 0;
	}
	public Ladung(String bezeichnung, int menge) {
		this.bezeichnung = bezeichnung;
		this.menge = menge;
	}
	
	public String toString() 
	{
		return menge + " " + bezeichnung;
	}
}
