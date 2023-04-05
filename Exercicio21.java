package aula19_Arrays;

public class Exercicio21 {

	public static void main(String[] args) {
		/*
		 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
		 * sugestão: A[x] = (int) Math.round(Math.random() * 1); Pede-se para
		 * implementar um programa que determine o percentual de números 0's e 1's
		 * existentes no vetor A.
		 */
		int[] vetorA = new int[10];
		int quantidadeDeZeros = 0;
		int quantidadeDeUm = 0;
		int porcentagemDeZero = 0;
		int porcentagemDeUm = 0;

		for (int x = 0; x < vetorA.length; x++) {
			vetorA[x] = (int) Math.round(Math.random() * 1);
//			Vezes 1, pois os números randômicos vão de zero a um 1, nessa ocasião

			if (vetorA[x] == 0) {
				quantidadeDeZeros++;
			} else if (vetorA[x] == 1) {
				quantidadeDeUm++;
			}
		}
		porcentagemDeZero = (quantidadeDeZeros * 100) / vetorA.length;
		porcentagemDeUm = (quantidadeDeUm * 100) / vetorA.length;

		System.out.print("VetorA = ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		System.out.println();
		System.out.println("Porcentagem de Zero: " + porcentagemDeZero);
		System.out.println("Porcentagem de Um: " + porcentagemDeUm);
	}
}
