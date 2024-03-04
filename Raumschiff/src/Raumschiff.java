import java.util.ArrayList;
import java.util.Random;
/**
 * Klasse zum Verwalten der Raumschiffe. Enthält Felder mit Daten über das Raumschiff, und Methoden um mit denen umzugehen.
 * @author Max Nolting
 */
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
		/**Anzahl der auf dem Schiff geladenen Photonentorpedos*/
		this.photonentorpedoAnzahl = 0;
		/**Höhe der Energieversorgung in Prozent*/
		this.energieversorgungInProzent = 0;
		/**Anteil bereiter Schilde in Prozent*/
		this.schildeInProzent = 0;
		/**Zustand der Schiffshülle in Prozent*/
		this.huelleInProzent = 0;
		/**Anteil der bereiten Lebenserhaltungssysteme*/
		this.lebenserhaltungssystemeInProzent = 0;
		/**Anzahl der verfügbaren Androiden*/
		this.androidenAnzahl = 0;
		/**Name des Schiffes*/
		this.schiffsname = "";
		/**Liste von Ladungselementen, mit denen das Schiff beladen ist.
		 * @see Ladung
		 * */
		this.ladungsverzeichnis = new ArrayList<>();
	}
	/**
	 * Vollparametrisierter Konstruktor für die Raumschiff-Klasse.
	 * @param photonentorpedoAnzahl
	 * @param energieversorgungInProzent
	 * @param schildeInProzent
	 * @param huelleInProzent
	 * @param lebenserhaltungssystemeInProzent
	 * @param androidenAnzahl
	 * @param schiffsname
	 */
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
	/**
	 * Getter-Methode für das Attribut photonentorpedoAnzahl
	 * @return photonenanzahlTorpedo
	 */
	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}
	/** Setter-Methode für das Attribut photonentorpedoAnzahl
	 * @param photonentorpedoAnzahl
	 * */
	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
	}
	/**
	 * Getter-Methode für das Attribut energieversorgungInProzent
	 * @return energieversorgungInProzent
	 */
	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}
	/**
	 * Setter-Methode für das Attribut energieversorgungInProzent
	 * @param energieversorgungInProzent
	 */
	public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
		this.energieversorgungInProzent = energieversorgungInProzent;
	}
	/**
	 * Getter-Methode für das Attribut schildeInProzent
	 * @return schildeInProzent
	 */
	public int getSchildeInProzent() {
		return schildeInProzent;
	}
	/**
	 * Setter-Methode für das Attribut schildeInProzent
	 * @param schildeInProzent
	 */
	public void setSchildeInProzent(int schildeInProzent) {
		this.schildeInProzent = schildeInProzent;
	}
	/**
	 * Getter-Methode für das Attribut huelleInProzent
	 * @return huelleInProzent
	 */
	public int getHuelleInProzent() {
		return huelleInProzent;
	}
	/**
	 * Setter-Methode für das Attribut huelleInProzent
	 * @param huelleInProzent
	 */
	public void setHuelleInProzent(int huelleInProzent) {
		this.huelleInProzent = huelleInProzent;
	}
	/**
	 * Getter-Methode für das Attribut lebenserhaltungssystemeInProzent
	 * @return lebenserhaltungssystemeInProzent
	 */
	public int getLebenserhaltungssystemeInProzent() {
		return lebenserhaltungssystemeInProzent;
	}
	/**
	 * Setter-Methode für das Attribut lebenserhaltungssystemeInProzent
	 * @param lebenserhaltungssystemeInProzent
	 */
	public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
	}
	/**
	 * Getter-Methode für das Attribut androidenAnzahl
	 * @return androidenAnzahl
	 */
	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}
	/**
	 * Setter-Methode für das Attribut androidenAnzahl
	 * @param androidenAnzahl
	 */
	public void setAndroidenAnzahl(int androidenAnzahl) {
		this.androidenAnzahl = androidenAnzahl;
	}
	/**
	 * Getter-Methode für das Attribut schiffsname
	 * @return schiffsname
	 */
	public String getSchiffsname() {
		return schiffsname;
	}
	/**
	 * Setter-Methode für das Attribut schiffsname
	 * @param schiffsname
	 */
	public void setSchiffsname(String schiffsname) {
		this.schiffsname = schiffsname;
	}
	
	/**
	 * Füge dem ladungsverzeichnis-Attribut ein Objekt neueLadung der Klasse Ladung hinzu.
	 * @param neueLadung
	 */
	public void addLadung(Ladung neueLadung) {ladungsverzeichnis.add(neueLadung);}
	
	/**
	 * Entferne einen Photonentorpedo von diesem Raumschiff und triff ein anderes. Raumschiff r
	 * @param r
	 */
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
	/**
	 * Reduziere Energieversorgung um 50% und triff ein anderes Raumschiff r.
	 * @param r
	 */
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
	/**
	 * Triff ein Raumschiff r. Reduziert Schilde des Ziels um 50%. Wenn das die Schilde auf 0 reduziert, verringert sich Hülle um 50%. Wenn das die Hülle auf 0 reduziert, verringern sich die Lebenserhaltungssysteme auf 0.
	 * @param r
	 */
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
	/**
	 * Füge message dem broadcastKommunikator hinzu.
	 * @param message
	 */
	public void nachrichtAnAlle(String message) 
	{
		this.broadcastCommunicator.add(message);
	}
	/**
	 * Gibt Einträge des broadcastKommunikator in der Konsole aus.
	 */
	public static void eintraegeImLogbuchZurueckgeben() 
	{
		System.out.println("Nachrichten im Logbuch:");
		for(String nachricht : Raumschiff.broadcastCommunicator) 
			System.out.println(nachricht);
	}
	/**
	 * lädt anzahlTorpedos Photonentorpedos aus der Ladung des Raumschiffes in das Raumschiff, oder so viele wie möglich wenn nicht genug in der Ladung vorhanden.
	 * @param anzahlTorpedos
	 */
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
	/**
	 * Bestimmt abhängig von der Anzahl der eingesetzten Droiden eine Gesamtmenge, um die repariert wird. Diese Anzahl an Prozentpunkten wird gleichmäßig auf die ausgewählten Eigenschaften (boolean-Wert true) aufgeteilt. Die Prozentzahlen können 100% nicht übersteigen.
	 * @param schutzschilde
	 * @param energieversorgung
	 * @param schiffshuelle
	 * @param anzahlDroiden
	 */
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
	/**
	 * Gib Aktuelle Attribute schiffsname, anzahlPhotonentorpedos, energieversorgungInProzent, schildeInProzent, huelleInProzent, lebensehrhaltungInProzent und androidenAnzahl des Raumschiffs auf der Konsole aus.
	 */
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
	/**
	 * Gib aktuelles Ladunsverzeichnis auf der Konsole aus.
	 */
	public void ladungsverzeichnisAusgeben() 
	{
		System.out.println("Ladungsverzeichnis Schiff " + this.schiffsname + ":");
		for(Ladung ladung : this.ladungsverzeichnis) 
			System.out.printf("\t%s: %d %n", ladung.getBezeichnung(), ladung.getMenge());
		
	}
	/**
	 * Entferne alle Ladungen mit menge = 0 aus dem Ladungsverzeichnis.
	 */
	public void ladungsverzeichnisAufraeumen() 
	{
		for(Ladung ladung : ladungsverzeichnis) 
			ladungsverzeichnis.removeIf(l -> l.getMenge() == 0);
		
	}
}
