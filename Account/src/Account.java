//Account.java

public class Account {
	
	private double balance; //variável de instância de classe que guarda o saldo
	private String name; //variavel de instancia de classe que guarda o nome da conta
	
	//construtor Account
	public Account ( double initialBalance, String name ) {
		
		//valida que initialBalance é > 0; Senão o saldo é iniciado com o valor 0 padrão
		if ( initialBalance >= 0.0 ) 
			balance = initialBalance;
		
	} //fim do construtor Account
	
	//Cria método credit que credita (adiciona) uma quantia à conta
	public void credit ( double amount ) {
		
		balance = balance + amount; //adiciona quantia (amount) ao saldo (balance)
		
	} //fim do método crédit
	
	
	//cria método para retirada de valor da conta
	public void withdraw (double amount) {
		
		if (amount <= balance) {
		balance = balance - amount; //retira a quantia (amount) do saldo (balance)
		}
		else System.out.print("Total de retirada excede o saldo da conta");
		
	} //fim do método withdraw
	
	
	//Cria método getBalance que retorna o saldo da conta 
	public double getBalance() {
		
		return balance; //fornece o valor do saldo ao método chamador
		
	} //fim do método getBalance
	
	//método para definir o nome do objeto 
	public void setName(String name) {
		this.name = name; //armazena o nome
	}
	
	//método para recuperar o nome do objeto
	public String getName() {
		return name; //retorna valor do nome para o chamador
	}
	
	
	
} // fim da classe Account
