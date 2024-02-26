import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice novaInvoice = new Invoice (null, null, 0, 0); 
			
		Scanner input = new Scanner (System.in);
	
		System.out.print("Digite o numero da nota:");
		String numero = input.nextLine();
		novaInvoice.setNumero(numero);
				
		System.out.print("Digite a quantidade de itens da nota:");
		int quantidade = input.nextInt();
			if(quantidade < 0)
				{
					quantidade = 0;
				}
		novaInvoice.setQuantidade(quantidade);
		
		System.out.print("Digite o valor por item:");
		double preco = input.nextInt();
			if(preco < 0.0)
				{
					preco = 0.0;
				}
		novaInvoice.setPreco(preco);
		
			
		double totalInvoice = quantidade * preco;
		
		System.out.printf("A nota de número %s contém %d itens no valor total de %.2f", novaInvoice.getNumero(), novaInvoice.getQuantidade(), totalInvoice);
		
		
	}
	
}
