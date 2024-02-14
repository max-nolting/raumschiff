import java.util.ArrayList;
import java.util.Random;

public class Raumschiff {
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemeInProzent;
	private int androidenAnzahl;
	private String schiffsname;
	static ArrayList<String> broadcastCommunicator = new ArrayList<>();
	private ArrayList<Ladung> ladungsverzeichnis = new ArrayList<>();
	
	public Raumschiff() 
	{
		this.photonentorpedoAnzahl = 0;
		this.energieversorgungInProzent = 0;
		this.schildeInProzent = 0;
		this.huelleInProzent = 0;
		this.lebenserhaltungssystemeInProzent = 0;
		this.androidenAnzahl = 0;
		this.schiffsname = "";
		this.ladungsverzeichnis = new ArrayList<>();
	}
	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent,
			int huelleInProzent, int lebenserhaltungssystemeInProzent, int androidenAnzahl, String schiffsname) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
		this.energieversorgungInProzent = energieversorgungInProzent;
		this.schildeInProzent = schildeInProzent;
		this.huelleInProzent = huelleInProzent;
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
		this.androidenAnzahl = androidenAnzahl;
		this.schiffsname = schiffsname;
	}
	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}
	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
	}
	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}
	public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
		this.energieversorgungInProzent = energieversorgungInProzent;
	}
	public int getSchildeInProzent() {
		return schildeInProzent;
	}
	public void setSchildeInProzent(int schildeInProzent) {
		this.schildeInProzent = schildeInProzent;
	}
	public int getHuelleInProzent() {
		return huelleInProzent;
	}
	public void setHuelleInProzent(int huelleInProzent) {
		this.huelleInProzent = huelleInProzent;
	}
	public int getLebenserhaltungssystemeInProzent() {
		return lebenserhaltungssystemeInProzent;
	}
	public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
	}
	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}
	public void setAndroidenAnzahl(int androidenAnzahl) {
		this.androidenAnzahl = androidenAnzahl;
	}
	public String getSchiffsname() {
		return schiffsname;
	}
	public void setSchiffsname(String schiffsname) {
		this.schiffsname = schiffsname;
	}

	public void addLadung(Ladung neueLadung) {ladungsverzeichnis.add(neueLadung);}
	
	public void photonentorpedoSchießen(Raumschiff r) 
	{
		if(this.photonentorpedoAnzahl == 0) 
		{
			this.nachrichtAnAlle("-=*Click*=-");
			return;
		}
		this.photonentorpedoAnzahl -= 1;
		this.nachrichtAnAlle("Photonentorpedo abgeschossen");
		this.treffer(r);
	}
	public void phaserkanoneSchießen(Raumschiff r) 
	{
		if(this.energieversorgungInProzent < 50) 
		{
			this.nachrichtAnAlle("-=*Click*=-");
			return;
		}
		this.energieversorgungInProzent -= 50;
		this.nachrichtAnAlle("Phaserkanone abgeschossen");
		this.treffer(r);
	}
	private void treffer(Raumschiff r) 
	{
		System.out.printf("%s wurde getroffen!\n", r.getSchiffsname());
		
		r.setSchildeInProzent(r.getSchildeInProzent() - 50);
		if(r.getSchildeInProzent() < 0) r.setSchildeInProzent(0);
		if(r.getSchildeInProzent() != 0) return;
		
		r.setEnergieversorgungInProzent(r.getEnergieversorgungInProzent() - 50);
		r.setHuelleInProzent(r.getHuelleInProzent() - 50);
		if(r.getHuelleInProzent() < 0) r.setHuelleInProzent(0);
		if(r.getEnergieversorgungInProzent() < 0) r.setEnergieversorgungInProzent(0);
		if(r.getHuelleInProzent() != 0) return;
		
		r.setLebenserhaltungssystemeInProzent(0);
		Raumschiff.broadcastCommunicator.add("Lebenserhaltungssysteme von " + r.getSchiffsname() + " wurden vernichtet.");
	}
	public void nachrichtAnAlle(String message) 
	{
		this.broadcastCommunicator.add(message);
	}
	public static void eintraegeImLogbuchZurueckgeben() 
	{
		System.out.println("Nachrichten im Logbuch:");
		for(String nachricht : Raumschiff.broadcastCommunicator) 
			System.out.println(nachricht);
	}
	public void photonentorpedosLaden(int anzahlTorpedos) 
	{
		int anzahlPhotonentorpedosInLadung = 0;
		for(Ladung ladung : ladungsverzeichnis)
			if(ladung.getBezeichnung() == "Photonentorpedo") anzahlPhotonentorpedosInLadung += ladung.getMenge();
		
		if(anzahlPhotonentorpedosInLadung == 0)
		{
			System.out.println("Keine Photonentorpedos gefunden!");
			nachrichtAnAlle("-=*Click*=-");
			return;
		}
		if(anzahlPhotonentorpedosInLadung > anzahlTorpedos)
		{
			int geladeneTorpedos = 0;
			for(Ladung ladung : ladungsverzeichnis)
			{
				if(ladung.getBezeichnung() != "Photonentorpedo") continue;
				if(ladung.getMenge() >= anzahlTorpedos - geladeneTorpedos)
				{
					ladung.setMenge(ladung.getMenge() - (anzahlTorpedos - geladeneTorpedos));
					this.photonentorpedoAnzahl += anzahlTorpedos;
					break;
				}
				this.photonentorpedoAnzahl += ladung.getMenge();
				geladeneTorpedos += ladung.getMenge();
				ladung.setMenge(0);
			}
			System.out.printf("%n Photonentorpedo(s) eingesetzt\n", anzahlTorpedos);
			return;
		}
		for(Ladung ladung : ladungsverzeichnis)
		{
			if(ladung.getBezeichnung() != "Photonentorpedo") continue;
			this.photonentorpedoAnzahl += ladung.getMenge();
			ladung.setMenge(0);
		}
		System.out.printf("%n Photonentorpedo(s) eingesetzt\n", anzahlPhotonentorpedosInLadung);
		
	}
	public void reparaturDurchführen(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle, int anzahlDroiden) 
	{
		Random random = new Random();
		int anzahlZuReparieren = 0;
		double randomValue = random.nextDouble() * 100;
		if(schutzschilde) anzahlZuReparieren++;
		if(energieversorgung) anzahlZuReparieren++;
		if(schiffshuelle) anzahlZuReparieren++;
		if(anzahlDroiden > this.androidenAnzahl) anzahlDroiden = this.androidenAnzahl;
		
		int reparaturValue = (int) (randomValue * anzahlDroiden) / (anzahlZuReparieren);
		
		if(schutzschilde) this.schildeInProzent += reparaturValue;
		if(energieversorgung) this.energieversorgungInProzent += reparaturValue;
		if(schiffshuelle) this.huelleInProzent += reparaturValue;
		
		if(this.schildeInProzent > 100) this.schildeInProzent = 100;
		if(this.energieversorgungInProzent > 100) this.energieversorgungInProzent = 100;
		if(this.huelleInProzent > 100) this.huelleInProzent = 100;
	}
	public void zustandRaumschiff() 
	{
		System.out.printf("Schiffsname: %s%n", this.schiffsname);
		System.out.printf("Anzahl Photonentorpedos: %d%n", this.photonentorpedoAnzahl);
		System.out.printf("Energieversorgung: %d%%%n", this.energieversorgungInProzent);
		System.out.printf("Schilde: %d%%%n", this.schildeInProzent);
		System.out.printf("Hülle: %d%%%n", this.huelleInProzent);
		System.out.printf("Lebenserhaltungssysteme: %d%%%n", this.lebenserhaltungssystemeInProzent);
		System.out.printf("Anzahl Androiden: %d%n", this.androidenAnzahl);
		
	}
	public void ladungsverzeichnisAusgeben() 
	{
		System.out.println("Ladungsverzeichnis Schiff " + this.schiffsname + ":");
		for(Ladung ladung : this.ladungsverzeichnis) 
			System.out.printf("\t%s: %d %n", ladung.getBezeichnung(), ladung.getMenge());
		
	}
	public void ladungsverzeichnisAufraeumen() 
	{
		for(Ladung ladung : ladungsverzeichnis) 
			ladungsverzeichnis.removeIf(l -> l.getMenge() == 0);
		
	}
}
