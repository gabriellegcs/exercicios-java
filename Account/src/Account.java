//Account.java

public class Account {
	
	private double balance; //variável de instância de classe que guarda o saldo
	
	//construtor Account
	public Account ( double initialBalance ) {
		
		//valida que initialBalance é > 0; Senão o saldo é iniciado com o valor 0 padrão
		if ( initialBalance >= 0.0 ) 
			balance = initialBalance;
		
	} //fim do construtor Account
	
	//Cria método credit que credita (adiciona) uma quantia à conta
	public void credit ( double amount ) {
		
		balance = balance + amount; //adiciona quantia (amount) ao saldo (balance)
		
	} //fim do método crédit
	
	//Cria método getBalance que retorna o saldo da conta 
	public double getBalance() {
		
		return balance; //fornece o valor do saldo ao método chamador
		
	} //fim do método getBalance
	
} // fim da classe Account
