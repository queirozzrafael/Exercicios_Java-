
public class EX_07 {

	public static void main(String[] args) {
		
		int anos = 18, meses = 10 , dias = 15; 
		int anosdia, mesdia, diasFin;
		
		anosdia = anos * 365; 
		mesdia = meses * 30; 
		diasFin = anosdia + mesdia + dias; 
		
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
		System.out.println("Essa é a idade em dias: " + diasFin);
		

	}

}
