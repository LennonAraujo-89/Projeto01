package SistemaAmbulanciaTransferencia;

import java.util.Scanner;

public class MenuInterativo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Data data = new Data();
		System.out.println(data.dataFormatada());
		
		sc.close();
	}
}
