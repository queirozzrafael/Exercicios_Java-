
public class EX_03 {

	public static void main(String[] args) {
		
		double g_ali, g_tra; 
		g_ali = 40; 
		g_tra = 25; 
		
		double dia, mes, m_diaria; 
		
		dia = g_ali + g_tra; 
		mes = dia * 22; 
		m_diaria = mes / 22;
		System.out.println("Esse é o gasto em um dia: " + dia);
		System.out.println("Esse é o gasto em um mês: " + mes);
		System.out.println("Essa é a média diária: " + m_diaria);

	}

}
