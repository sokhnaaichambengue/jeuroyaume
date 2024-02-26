package royaume;

public class Jeu  {
String royaume;
String fabrique;
String joueur;
String nouveauroyaume;
int ecus;
String village;
String paysan;
public Jeu(String royaume, String fabrique, String joueur, String paysan, String nouveauroyaume, int ecus, String village) {
	this.royaume = royaume;
	this.fabrique = fabrique;
	this.joueur = joueur;
	this.nouveauroyaume=nouveauroyaume;
	this.ecus=ecus;
	this.village=village;
	this.paysan=paysan;
	
}
public String toString(String jeu, String royaume, String fabrique, String joueur) {
	this.royaume=royaume;
	this.fabrique=fabrique; 
	this.joueur=joueur ;
	return jeu;
}
public String toString (String nouveauroyaume, int ecus, String village, String paysan) {
	this.ecus=ecus;
	this.village=village;
	this.paysan=paysan;
	return nouveauroyaume;
}
public  void  initialyze(String jeu,String nouveauroyaume) {
	jeu="nouveauroyaume";
	
	}
	public void jeu(int nbtours) {
		for(int i=1;i<=4;i++) {
			if(nbtours==4) {
			}
		}
	}
	public String finjeu(String finjeu){
		return "finjeu";
		
		

		}
			
		}
		
	

	
