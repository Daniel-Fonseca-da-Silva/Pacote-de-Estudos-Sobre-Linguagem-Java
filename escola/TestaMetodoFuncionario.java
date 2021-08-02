package escola;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaMetodoFuncionario {
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Saldo atual: " + String.valueOf(func.getSalario()) + " $ reais", "Conta do usuário", JOptionPane.INFORMATION_MESSAGE);
		String saldo = JOptionPane.showInputDialog(null, "Insira o valor no campo", "Valor para ser depositado", JOptionPane.QUESTION_MESSAGE);
		
		int res = JOptionPane.showConfirmDialog(null, "Confirma transação", "Coloque seu valor", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(res == 0)
		{
			func.setSalario(Double.parseDouble(saldo));
			System.out.println("Seu salário atual é " + func.getSalario());
			JOptionPane.showMessageDialog(null, "Saldo atual " + String.valueOf(func.getSalario()) + " $ reais", "Resultado da conversão",JOptionPane.QUESTION_MESSAGE);
		}
		else if(res == 1)
		{
			System.out.println("Seu salário atual é " + func.getSalario());
			JOptionPane.showMessageDialog(null, "Saldo atual " + String.valueOf(func.getSalario()) + " $ reais", " Resultado da conversão", JOptionPane.QUESTION_MESSAGE);
		}
		else if(res == 2)
		{
			JOptionPane.showMessageDialog(null, "Transação cancelada", " Resultado da conversão", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Transação cancelada");
		}
		
		sc.close();
	}
}
