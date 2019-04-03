
public class Time {
	String nome;
	int vitorias;
	int derrotas;
	int empates;
	int golsContra;
	int golsPro;
	int gols;
	float habilidade;

	Jogador[] jogador = new Jogador[23];

	public Time() {
		for (int i = 0; i < 23; i++) {
			jogador[i] = new Jogador();
			jogador[i].nome = "Jogador " + i;
		}
	}

}
