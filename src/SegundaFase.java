
public class SegundaFase {
	public SegundaFase(Tabela tabela) {
		int dia = 14;

		for (int i = 0; i < 16; i += 2) {
			new Jogo(tabela.time[i], tabela.time[i + 1]);
		}
		System.out.println("_________________________________________");
		System.out.println("RESULTADO DAS OITAVAS");
		orderByVit(tabela, 16);
		for (int i = 0; i < 8; i += 2) {
			new Jogo(tabela.time[i], tabela.time[i + 1]);
		}
		System.out.println("RESULTADO DAS QUARTAS");
		orderByVit(tabela, 8);
		for (int i = 0; i < 4; i += 2) {
			new Jogo(tabela.time[i], tabela.time[i + 1]);
		}
		System.out.println("RESULTADO DA SEMIFINAL");
		orderByVit(tabela, 4);
		for (int i = 0; i < 2; i += 2) {
			new Jogo(tabela.time[i], tabela.time[i + 1]);
		}
		System.out.println("RESULTADO DA FINAL");
		orderByVit(tabela, 2);

		System.out.println(tabela.time[0].nome.toUpperCase() + " É CAMPEÃÃÃÃO");
	}

	public static void orderByVit(Tabela tabela, int n) {
		Time aux;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (tabela.time[i].vitorias > tabela.time[j].vitorias) {
					aux = tabela.time[i];
					tabela.time[i] = tabela.time[j];
					tabela.time[j] = aux;

				}
			}
		}
		for (int i = 0; i < n; i += 2) {
			System.out.println(tabela.time[i].nome + " " + tabela.time[i].gols + " X " + tabela.time[i + 1].gols + " "
					+ tabela.time[i + 1].nome);
		}
		System.out.println();
	}
}
