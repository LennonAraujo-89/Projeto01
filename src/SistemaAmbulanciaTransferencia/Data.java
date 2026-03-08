package SistemaAmbulanciaTransferencia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Data {

    LocalDate dataAtual = LocalDate.now();
    LocalTime horaAtual = LocalTime.now();

    int dia, mes, ano;

    Data(){
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");

    String dataFormatada() {
		return String.format("\nData: %d/%d/%d Hora: %s\n", this.dia, this.mes, this.ano, horaAtual.format(horaFormatada));
	}
}
