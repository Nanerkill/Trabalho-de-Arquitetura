package trabalhoArquitetura;
public class Trabalho {
	public static void main (String [] args) {
		int aux, i, n = 5, vet[] = {3, 1, 2, 5, 4};
		boolean saida = true;
		while (saida) {
			saida = false;
			i = 0;  //n-1 pois vamos comparar 1 valor com os demais (n-1) valores
			while(i<(n-1)) {
				if (vet[i] > vet[i + 1]) { //Compara com o próximo
					saida = true; //fez uma troca
					aux = vet[i];
					vet[i] = vet[i + 1];
					vet[i + 1] = aux;
				}
				i++;
			}
			if (!saida)
				break; //se não fez troca, encerra o código
			saida = false;
			i = (n - 2);
			while (i >= 0) {
				if (vet[i] > vet[i + 1]) { //
					saida = true; //
					aux = vet[i];
					vet[i] = vet[i + 1];
					vet[i + 1] = aux;
				}
				i--;
			}
		}
		i = 0;
		while (i < n) {
			System.out.println(vet[i]);
			i++;
		}
	}
}