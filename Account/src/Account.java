//Account.java

public class Account {
	
	private String name; //variavel de instancia de classe que guarda o nome da conta
	private double balance; //variável de instância de classe que guarda o saldo
	
	//construtor Account
	public Account ( double initialBalance, String name ) {
		
		this.name = name; //atribui name à variável de instância name
		
		if ( balance > 0.0 ) //se o saldo for válido 
			this.balance = balance;
		
	} 
	
	//Cria método que deposita uma quantia à conta
	public void deposit ( double depositAmount ) {
		
		if(depositAmount > 0.0) //se o saldo for válido
			balance = balance + depositAmount;
			
	} 
	
	
	//cria método para retirada de valor da conta
	public void withdraw (double amount) {
		
		if (amount <= balance) {
		balance = balance - amount; //retira a quantia (amount) do saldo (balance)
		}
		else System.out.print("Total de retirada excede o saldo da conta");
		
	} 
	
	
	//Cria método getBalance que retorna o saldo da conta 
	public double getBalance() {
		
		return balance; //fornece o valor do saldo ao método chamador
		
	} 
	
	//método para definir o nome do objeto 
	public void setName(String name) {
		this.name = name; //armazena o nome
	}
	
	//método para recuperar o nome do objeto
	public String getName() {
		return name; //retorna valor do nome para o chamador
	}
	
	
	
} // fim da classe Account
