package SistemaAmbulanciaTransferencia;

public class Atendimento {
	
	//Solicitantes
	
	String carater = "Simples" ;
	
	//Identificação do paciente
	
	String nomeDoPaciente = "Paciente";
	int idadeDoPaciente = 0;
	String sexo = "";
	
	
	//Referente ao Caráter da Ocorrencia
	
	String ocorrencia = "Emergencia Operar com segurança e cautel";
	
	String Chamada(String carater) {
		this.carater = carater;
		
		if(this.carater.equalsIgnoreCase("Emergencia")) {
			this.ocorrencia = "Emergencia Operar com segurança, cautel e obrevidade.";
		}else if(this.carater.equalsIgnoreCase("Urgengia")) {
			this.ocorrencia = "Emergencia Operar com segurança e obrevidade.";
		}
		
		return String.format("Tipo de Ocorrencia: %s: %s", this.carater, this.ocorrencia);
	}
}
