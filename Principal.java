import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import Usuario;
import java.util.Scanner;

public class Principal{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Hola mundo");
		horaLocal();
		System.out.print("Introduce una cantidad de usuarios: ");
		int n = Integer.parseInt(teclado.nextLine().trim());
		Usuario[] usuarios = crearUsuario(n);
		for(int i=0; i<n; i++){
			System.out.println(usuarios[i]);
		}
		

	}
	public static void horaLocal(){
		LocalTime horaActual = LocalTime.now();
        System.out.println("Hora local: " + horaActual);

        // Dar formato a la hora (HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora formateada: " + horaActual.format(formatter));
	}

	public static Usuario[] crearUsuario(int n){
		Usuario[] usuarios = new Usuario[n];
		for(int i=0; i<n; i++){
			System.out.print("Introduce el nombre: ");
			String nombre = teclado.nextLine().trim();
			System.out.print("Introduce tus apellidos: ");
			String apellidos = teclado.nextLine().trim();
			System.out.print("Introduce el email: ");
			String email = teclado.nextLine().trim();
			usuarios[i] = new Usuario(nombre, apellidos, email);
		}

		return usuarios;
	}

}