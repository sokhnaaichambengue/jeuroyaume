package royaume;
public class FinTour {
public String nom;	
public int cout;
int paysan = 0;
int nouveauvillage=0;
int impot=0;
public FinTour() {
	
}	

public FinTour(String nom, int cout, int paysan, int nouveauvillage,  int impot) {
	this.nom = nom;
	this.cout = cout;
	this.paysan = paysan;
	this.nouveauvillage = nouveauvillage;
	this.impot = impot;
	
}

public  boolean actionCorrecte(String nom) {
	if(nom=="paysan") {
		System.out.println("paysan");
	}
	else if(nom=="nouveauvillage") {
		System.out.println("nouveauvillage");
	}
	else if(nom=="impot") {
		System.out.println("impot");
	}
	else if(nom=="finirtour") {
		System.out.println("finirtour");
		return true;
	}
	return false;
}
public int  actioncreer( int achatpaysan,int construire,int prelever,int finirtour,int passeruneannee) {
	if(paysan==achatpaysan) {
	return achatpaysan;
}
	else if(impot==prelever) {
		return prelever;
	}
	else if(nouveauvillage==construire) {
		return construire;
	} else if(finirtour==passeruneannee){
		return passeruneannee;
	}
	return nouveauvillage;
	
	
}

}


