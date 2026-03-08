package SistemaAmbulanciaTransferencia;

public class Paciente {

    //Identificação do paciente
	
	String nomeDoPaciente = "", sexoDoPaciente = "";
	int idadeDoPaciente = 0;


    Paciente(){
        nomeDoPaciente = "Paciente sem identificação";
    }

    Paciente(String nomePaciente, int idadePaciente, String sexo){
        this.nomeDoPaciente = nomePaciente;
        this.idadeDoPaciente = idadePaciente;
        this.sexoDoPaciente = sexo;
    }

    String pacienteFormatado(){
        return String.format("\nNome: %s Idade: %d Sexo: %s", this.nomeDoPaciente, this.idadeDoPaciente, this.sexoDoPaciente);
    }

}
