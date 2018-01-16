import java.util.Scanner;;
public class PruebaDeFrecuencia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Radio radio = new Radio();
		String tipo = "";
		System.out.println("1. AM");
		System.out.println("2. FM");
		System.out.println("¿Que emisora desea poner?");
		tipo = teclado.nextLine();
		System.out.println("");
		if (tipo == "AM") {
			String emisora = "";
			System.out.println("Emisora, AM");
			System.out.println(radio.frecAdelante());	
		} else if (tipo == "FM"){
			System.out.println(radio.frecAdelante());
		}
		

	}

}
