package SistemaAmbulanciaTransferencia;

import java.util.Scanner;

public class MenuInterativo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Paciente paciente = new Paciente();

		System.out.println("Digite o nome do Paciente: ");
		paciente.nomeDoPaciente = sc.nextLine();

		System.out.println("Digite a idade do Paciente: ");
		paciente.idadeDoPaciente = sc.nextInt();

		while (paciente.idadeDoPaciente < 1 || paciente.idadeDoPaciente > 120) {
			System.out.println("Erro na idade!!!");
			System.out.println("Digite a idade do Paciente: ");
			paciente.idadeDoPaciente = sc.nextInt();
		}
		
		System.out.println("Digite o sexo do Paciente: ");
		paciente.sexoDoPaciente = sc.next();

		System.out.println(paciente.pacienteFormatado());
	
		
		//Chamando Data
		Data data = new Data();
		System.out.println(data.dataFormatada());
		
		sc.close();
	}
}
