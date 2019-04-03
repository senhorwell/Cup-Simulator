import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabela tabela = new Tabela();
		Grupo[] grupo = new Grupo[8];
		agrupamento(tabela, grupo);
		new PrimeiraFase(grupo);
		tabelamento(tabela, grupo);
		orderByVit(tabela);
		printTabela(tabela, 32);
		new SegundaFase(tabela);
	}

	public static void printTabela(Tabela tabela, int n) {
		System.out.println("\n\t---------------------------------------------------");
		System.out.println("\t|TIME\t\tVIT\tEMP\tDER\tGF\tGC|");
		System.out.println("\t___________________________________________________");

		for (int i = 0; i < n; i++) {
			if (tabela.time[i].nome.length() <= 5) {
				System.out.println("\t|" + tabela.time[i].nome + " \t\t " + tabela.time[i].vitorias + " \t "
						+ tabela.time[i].empates + " \t " + tabela.time[i].derrotas + " \t " + tabela.time[i].golsPro
						+ " \t " + tabela.time[i].golsContra + "|");

			} else if (tabela.time[i].nome.length() >= 14) {
				System.out.println("\t|" + tabela.time[i].nome + "  " + tabela.time[i].vitorias + " \t "
						+ tabela.time[i].empates + " \t " + tabela.time[i].derrotas + " \t " + tabela.time[i].golsPro
						+ " \t " + tabela.time[i].golsContra + "|");
			} else {
				System.out.println("\t|" + tabela.time[i].nome + " \t " + tabela.time[i].vitorias + " \t "
						+ tabela.time[i].empates + " \t " + tabela.time[i].derrotas + " \t " + tabela.time[i].golsPro
						+ " \t " + tabela.time[i].golsContra + "|");
			}

		}
		System.out.println("\t---------------------------------------------------");
	}

	public static void orderByVit(Tabela tabela) {
		Time aux;
		for (int i = 0; i < 32; i++) {
			for (int j = i + 1; j < 32; j++) {
				if (tabela.time[i].vitorias < tabela.time[j].vitorias) {
					aux = tabela.time[i];
					tabela.time[i] = tabela.time[j];
					tabela.time[j] = aux;

				}
			}
		}
	}

	public static void agrupamento(Tabela tabela, Grupo[] grupo) {
		int i = 0;
		for (int j = 0; j < 8; j++) {
			grupo[j] = new Grupo();
			for (int k = 0; k < 4; k++) {
				grupo[j].time[k] = tabela.time[i];
				i++;
			}
		}
	}

	public static void tabelamento(Tabela tabela, Grupo[] grupo) {
		int i = 0;
		for (int j = 0; j < 8; j++) {
			for (int k = 0; k < 2; k++) {
				tabela.time[i] = grupo[j].time[k];
				i++;
			}
		}
	}
}