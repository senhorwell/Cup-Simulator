import java.util.*;

public class Jogo {

	public Jogo(Time time1, Time time2, Time time3, Time time4) {
		Thread j1 = new Thread() {
			public void run() {
				Random r = new Random();
				int n;
				time1.gols = 0;
				time2.gols = 0;
				for (int i = 0; i < 90; i++) {
					n = r.nextInt(100);
					if (n > 0 && n < 20) {
						if (n * time1.habilidade > 100 && n * time2.habilidade < 100) {
							time1.gols++;
							time1.golsPro++;
							time2.golsContra++;
						} else if (n * time2.habilidade > 100 && n * time1.habilidade < 100) {
							time2.gols++;
							time2.golsPro++;
							time1.golsContra++;
						}
					}
				}
				if (time1.gols > time2.gols) {
					time1.vitorias++;
					time2.derrotas++;
				} else if (time2.gols > time1.gols) {
					time2.vitorias++;
					time1.derrotas++;
				} else {
					time1.empates++;
					time2.empates++;
				}
			}
		};
		Thread j2 = new Thread() {
			public void run() {
				Random r = new Random();
				int n;
				time3.gols = 0;
				time4.gols = 0;
				for (int i = 0; i < 90; i++) {
					n = r.nextInt(100);
					if (n > 0 && n < 20) {
						if (n * time3.habilidade > 100 && n * time4.habilidade < 100) {
							time3.gols++;
							time3.golsPro++;
							time4.golsContra++;
						} else if (n * time4.habilidade > 100 && n * time3.habilidade < 100) {
							time4.gols++;
							time4.golsPro++;
							time3.golsContra++;
						}
					}
				}
				if (time3.gols > time4.gols) {
					time3.vitorias++;
					time4.derrotas++;
				} else if (time4.gols > time3.gols) {
					time4.vitorias++;
					time3.derrotas++;
				} else {
					time3.empates++;
					time4.empates++;
				}
			}
		};

		j1.start();
		j2.start();
	}

	public Jogo(Time time1, Time time2) {
		Thread j1 = new Thread() {
			public void run() {
				Random r = new Random();
				int n;
				time1.gols = 0;
				time2.gols = 0;
				for (int i = 0; i < 90; i++) {
					n = r.nextInt(100);
					if (n > 0 && n < 20) {
						if (n * time1.habilidade > 100 && n * time2.habilidade < 100) {
							time1.gols++;
							time1.golsPro++;
							time2.golsContra++;

						} else if (n * time2.habilidade > 100 && n * time1.habilidade < 100) {
							time2.gols++;
							time2.golsPro++;
							time1.golsContra++;

						}
					}
				}
				if (time1.gols > time2.gols) {
					time1.vitorias++;
					time2.derrotas++;
				} else if (time2.gols > time1.gols) {
					time2.vitorias++;
					time1.derrotas++;
				} else {
					time1.empates++;
					time2.empates++;
				}
			}
		};

		j1.start();
	}

}
