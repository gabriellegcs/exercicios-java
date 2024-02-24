
import java.util.Scanner;

public class AccountTest {

	//método main inicia a execução do aplicativo Java
	public static void main(String[] args) {
	
		Account account1 = new Account (50.00); //cria um objeto account
		Account account2 = new Account (-7.53); //cria um objeto account
		
		//exibe o saldo inicial de cada objeto
		System.out.printf( "account1 saldo: $%.2f \n", account1.getBalance() );
		System.out.printf( "account2 saldo: $%.2f \n", account2.getBalance());
		
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		double depositAmount; //quantia de depósito lida a partir do usuário
		
		System.out.print( "Digite o valor a depositar na account1: " ); //prompt
		depositAmount = input.nextDouble(); //entrada do usuário
		System.out.printf( "\nAdicionado $%.2f a account1\n\n", depositAmount );
		account1.credit(depositAmount); //chama o método cŕedito e passa a varíavel depositAmount como argumento
		
		//exibe os saldos
		System.out.printf( "account1 saldo: $%.2f \n", account1.getBalance() );
		System.out.printf( "account2 saldo: $%.2f \n", account2.getBalance() );

		System.out.print("Digite o valor a depositar na account2: ");
		depositAmount = input.nextDouble();  //entrada do usuário
		System.out.printf("\nAdicionado $%.2f a account2\n\n", depositAmount);
		account2.credit(depositAmount);//chama o método cŕedito e passa a varíavel depositAmount como argumento
		
		System.out.printf("account1 saldo: $%.2f \n", account1.getBalance() );
		System.out.printf("account2 saldo: $%.2f \n", account2.getBalance());

	} //fim de main

} // fim da classe AccountTest
