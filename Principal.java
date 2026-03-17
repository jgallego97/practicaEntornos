import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal{
	public static void main(String[] args){
		System.out.println("Hola mundo");
		horaLocal();
		

	}
	public static void horaLocal(){
		LocalTime horaActual = LocalTime.now();
        System.out.println("Hora local: " + horaActual);

        // Dar formato a la hora (HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora formateada: " + horaActual.format(formatter));
	}

}