//Entrada básica com uma caixa de diálogo

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		//pede para o usuário inserir seu nome
		String name =
				JOptionPane.showInputDialog("Qual é o seu nome");
		
		//cria a mensagem
		String message = 
				String.format("Bem-vindo, %s, ao Java Programming!", name);
		
		//exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
		
	} // fim de main

} //fim da classe NameDialog
