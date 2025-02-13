package vetores_matrizes;

public class ExercicioVetor {
	public static void main(String[] args) {
		int[] meuVetor = new int[]{1,2,3,4,5};
		int[] aux = inverterVetor(meuVetor);
		imprimirVetor(aux);
		//imprimirVetor(inverterVetor(meuVetor));
	}
	
	public static int[] inverterVetor(int[] vetor) {
		
		int[] aux = new int[vetor.length];
		
		for(int i = 0; i < vetor.length; i++) {
			aux[vetor.length - i - 1] = vetor[i];
		}
		
		return aux;
	}
	
	public static void imprimirVetor(int[] vetor) {
		System.out.print("\nVetor: ");
		for(int i = 0 ; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
