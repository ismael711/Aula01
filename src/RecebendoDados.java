import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nomeUsuario;
		
		System.out.println("Por favor, escreva o seu nome: ");
		//A linha abaico lê o texto que o user escrever no teclado
		nomeUsuario = leitor.next();
		
		System.out.println("Obrigado por utiilizar o programa, " + nomeUsuario);
		
		leitor.close();
		
	}

}
