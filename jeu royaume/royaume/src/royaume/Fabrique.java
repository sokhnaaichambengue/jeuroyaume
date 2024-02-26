package royaume;

public class Fabrique {
	public static void main(String[] args) {
		Roturier r=new Roturier();
		FinTour f= new FinTour();
		 Royaume r1=new Royaume("personnes","roturier","paysan","clerge","chevaliers","nobles");
		r1.veillir(0,0);
		r1.mourir(0, 0);
		r.impot(0);
		r1.depense();
		r1.production(0, 0);
		r1.impot(0, 0);
		r1.ajouthabitant(0, 0);
		r1.eglise(null, null);
		r1.affronttements(null, null);
		r1.servitude(null, null);
		f.actionCorrecte(null);
		f.actioncreer(0, 0, 0, 0, 0);



		
		 
		 
		 
		
		 
	}

}
