public class TestaLaco2 {
	public static void main(String[] args) {
		
		// Gerando espa�os entre uma linha e outra

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
