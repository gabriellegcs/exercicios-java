
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account myAccount = new Account(0, null);

		// mostra o nome inicial da conta, o valor padrão String assim que cria a conta
		System.out.printf("Nome inicial da conta é: %s%n%n", myAccount.getName());

		// solicita e lê o nome
		System.out.printf("Insira o novo nome da conta:");
		String theName = input.nextLine(); // lê uma linha de texto
		myAccount.setName(theName); // insere theName em myAccount
		System.out.println(); // gera saída de uma linha em branco

		// exibe o nome armazenado no objeto myAccount
		System.out.printf("O nome do objeto myAccount é:%n%s%n", myAccount.getName());

//		//exibe o saldo inicial de cada objeto
//		System.out.printf( "account1 saldo: $%.2f \n", account1.getBalance() );
//		System.out.printf( "account2 saldo: $%.2f \n", account2.getBalance());

		// cria Scanner para obter entrada a partir da janela de comando
		double depositAmount; // quantia de depósito lida a partir do usuário

		System.out.print("Digite o valor a depositar na conta: "); // prompt
		depositAmount = input.nextDouble(); // entrada do usuário
		System.out.printf("\nAdicionado $%.2f a conta\n\n", depositAmount);
		myAccount.credit(depositAmount); // chama o método cŕedito e passa a varíavel depositAmount como argumento

		// exibe os saldos
		System.out.printf("Saldo da conta: $%.2f \n", myAccount.getBalance());

//    	double withdrawAmount; //quantia de retirada lida a partir do usuário

//		System.out.print( "Digite o valor a retirar na account1: " ); //prompt
//		withdrawAmount = input.nextDouble(); //entrada do usuário
//		System.out.printf( "\nRetirado $%.2f da conta\n\n", withdrawAmount );
//		myAccount.withdraw(withdrawAmount); //chama o método withdraw e passa a varíavel depositAmount como argumento

//		System.out.printf("account1 saldo: $%.2f \n", myAccount.getBalance() );
//		

	} // fim de main

} // fim da classe AccountTest
