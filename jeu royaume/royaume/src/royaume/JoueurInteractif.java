package royaume;

import java.util.Scanner;
 class JoueurInteractif extends  Actio {
	 public JoueurInteractif() {
			super();
			// TODO Auto-generated constructor stub
		}
Scanner sc= new Scanner(System.in);
System.out.println("donner la prochaine action");
int prochaineaction=sc.nextInt();
public int FabricationAction(int actions) {
		return actions;
	}
@Override
public String action() {
	// TODO Auto-generated method stub
	return null;
}
}
