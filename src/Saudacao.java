import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		//Linha abaixo cria um objeto chamado leitor (pode ser inventado outro nome)
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, insira seu nome: ");
		//Para realizar a leitura de um texto digitado pelo usuário no teclado, devemos escrever o nome do nosso Scanner (leitor), seguido de .next()
		leitor.next();
		//Toda vez que nosso programa utilizar um recurso externo (banco de dados, TXT, Scanner) devemos liberar esse recurso após o uso
		leitor.close();

	}

}
