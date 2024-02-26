package royaume;
public class Royaume {
	public String Personnes;
	public String Roturier;
	public String Paysan;
	public String clerge;
	public String chevaliers;
	public String nobles;
	

public Royaume(String personnes, String roturier, String paysan, String clerge, String chevaliers, String nobles) {
		super();
		Personnes = personnes;
		Roturier = roturier;
		Paysan = paysan;
		this.clerge = clerge;
		this.chevaliers = chevaliers;
		this.nobles = nobles;
	}

public void veillir(int capacite,int pdv){
	if(pdv<capacite) {
		System.out.println("vous etes vieux");
}
else {

	System.out.println("vous etes jeunes");
}
}

public void production(int pourcentvieux,int pourcentenfants) {
	if(pourcentvieux <pourcentenfants) {
		System.out.println("la productivite d'enfants est plus enleve");
	}
	else {
		System.out.println("la productivite de vieux est plus eleve")	;
	}
}
public void impot(int gain,int depense) {
	if(gain>depense) {
		depense/=2;
		System.out.println("donne l'impot");
	}
	else {
		System.out.println("ne donne pas l'impot");
	}
}
public void mourir(int capacite,int tropfaible) {
	if(capacite==tropfaible) {
		System.out.println("vous mourrez");
	}
	else {
		System.out.println("vous allez survivre");
	}	
}
	public void ajouthabitant(int r,int nbhabitant) {
		if(r==nbhabitant) {
			nbhabitant++;
		}
	}
	public void depense() {
		
	}
	public void eglise(String priere,String clerge) {
		if(priere=="clerge") {
			System.out.println("on aeffectuer une priere");
		}
		else {
			System.out.println("pas de priere");	
		}
	}
	public void affronttements(String guerre,String ennemis) {
		if(guerre=="ennemis") {
			System.out.println("il y'a guerre");
		}
		else {
			System.out.println(" y'a pas de guerre");
		}
	}
	public void servitude(String nobles,String demande) {
		if(nobles=="demande") {
			System.out.println("quand les nobles demandes les autres execute");
		}
		else {
			System.out.println("personnes n'a le doit d'executer ");
		}
	}
	
	
	public String toString(String Royaume ,String personnes,String roturier,String clerge,String chevaliers ) {
 		return Royaume="affiche"
		+this.Personnes +""
		+this. Roturier+""
		+this. Paysan+""
		+this. clerge+""
		+this. chevaliers;
		
		
	}
	}
	
	

