
public class EX_06 {

	public static void main(String[] args) {
		//Distancia percorrida
		double percurso = 150; 
		//Consumo médio
		double kml = 12; 
		//Valor litro
		double valorL = 6.50; 
		
		
		double calcL, valorFin;
		
		//Quantos Litros necessários para percorres a distancia
		calcL = percurso/kml; 
		
		valorFin = calcL * valorL; 
		
		System.out.println("Distancia a ser percorrida: " + percurso);
		System.out.println("Consumo médio: " + kml);
		System.out.println("Valor do litro: " + valorL);
		System.out.println("Valor gasto no percurso: " + valorFin);
		

	}

}
