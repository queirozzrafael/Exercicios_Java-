
public class EX_02 {

	public static void main(String[] args) {
		
		double Prova_pra1 = 2.0;
		double Prova_teo1 = 3.0;
		double Prova_int1 = 0.5;
		double AEP1 = 0.5; 
		double Prova_pra2 = 2.0;
		double Prova_teo2 = 3.0;
		double Prova_int2 = 1.0;
		double AEP2 = 0.0; 
		
		
		double bim1, bim2; 
		
		bim1 = Prova_pra1 + Prova_teo1 + Prova_int1 + AEP1; 
		bim2 = Prova_pra2 + Prova_teo2 + Prova_int2 + AEP2; 
		
		double media; 
		
		media = (bim1 + bim2)/2 ; 
		
		System.out.println("Essa é a média final: " + media);
		if (media >= 6.0) {
			System.out.println("Você foi aprovado");
		}
		
		else {
			System.out.println("Você foi reprovado");
		}


	}

}
