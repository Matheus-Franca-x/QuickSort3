package view;

import controller.Ordenacao;

public class Main {

	public static void main(String[] args) 
	{
		
		int[] vetor = {99, 98, 97, 96, 95, 94, 93, 92, 91};
		
		Ordenacao ordena = new Ordenacao();
		
		vetor = ordena.quickSort(vetor, 0, vetor.length -1);
		
		for (int valor : vetor)
		{
			System.out.println(valor);
		}
		
		
	}

}
