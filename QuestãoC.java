package manzzano45;

public class QuestãoC {
	public static void main(String[] args) {
		int somaValoresPares = 0;

		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				somaValoresPares += i;
			}
		}

		System.out.println("Somatório dos valores pares de 1 até 500: " + somaValoresPares);
	}
}