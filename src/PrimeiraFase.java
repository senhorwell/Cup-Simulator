public class PrimeiraFase {
	public PrimeiraFase(Grupo grupo[]) {
		int dia = 14;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<8; j++) {
				if(i==0) {
					new Jogo(grupo[j].time[0],grupo[j].time[2],grupo[j].time[1],grupo[j].time[3]);
				}
				else if(i==1) {
					new Jogo(grupo[j].time[1],grupo[j].time[2],grupo[j].time[0],grupo[j].time[3]);
				}
				else {
					new Jogo(grupo[j].time[0],grupo[j].time[1],grupo[j].time[2],grupo[j].time[3]);
				}
				printDia(dia,grupo);
				dia++;
			}
		}
	}
	
	public static void printDia(int dia, Grupo grupo[]) {
		System.out.println("________________DIA " + dia + " DE JULHO________________");
		for(int i=0;i<8;i++) {
			System.out.println("GRUPO " + ((char)(i+65)));
			System.out.println("\t|TIME\t\tVIT\tEMP\tDER\tGF\tGC|");
			for(int j=0;j<4;j++) {
				if (grupo[i].time[j].nome.length()<=5) {
					System.out.println("\t|" + grupo[i].time[j].nome + " \t\t " + grupo[i].time[j].vitorias + " \t " + grupo[i].time[j].empates + " \t " + grupo[i].time[j].derrotas + " \t " + grupo[i].time[j].golsPro + " \t " + grupo[i].time[j].golsContra + "|");

				}
				else if(grupo[i].time[j].nome.length()>=14){
					System.out.println("\t|" + grupo[i].time[j].nome + "  " + grupo[i].time[j].vitorias + " \t " + grupo[i].time[j].empates + " \t " + grupo[i].time[j].derrotas + " \t " + grupo[i].time[j].golsPro + " \t " + grupo[i].time[j].golsContra + "|");
				} 
				else {
					System.out.println("\t|" + grupo[i].time[j].nome + " \t " + grupo[i].time[j].vitorias + " \t " + grupo[i].time[j].empates + " \t " + grupo[i].time[j].derrotas + " \t " + grupo[i].time[j].golsPro + " \t " + grupo[i].time[j].golsContra + "|");
				}
			}
		}
		System.out.println();
	}

}