package faturamentoMes;

public class faturamentoMes {
	
	public static void main(String[] args) {
		System.out.println("FATURAMENTO MENSAL");
		
		double SP = 67836.43,RJ = 36678.66, MG = 29229.88,ES = 27165.48,Outros =19849.53;
		double total= SP + RJ + MG + ES + Outros;
		
		System.out.println("TOTAL DO FATURAMENTO: " + total);
		System.out.println("\n___________________\n");
		System.out.println("Participação por estado em porcentagem");
		System.out.printf("SP: %.2f%%\n",calculoDaPorcentagem(total,SP),"%" );
		System.out.printf("RJ: %.2f%%\n",calculoDaPorcentagem(total,RJ),"%" );
		System.out.printf("MG: %.2f%%\n",calculoDaPorcentagem(total,MG),"%" );
		System.out.printf("ES: %.2f%%\n",calculoDaPorcentagem(total,ES),"%" );
		System.out.printf("Outros: %.2f%%\n",calculoDaPorcentagem(total,Outros),"%" );
	}
	public static Double calculoDaPorcentagem( double faturamentoMensal, double faturamentoTotal) {
		return (faturamentoTotal/faturamentoMensal)*100;
	}	
}