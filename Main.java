import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double valor1, valor2, resultado;
	
	System.out.println("Calculadora digital!");
	System.out.print("Digite o primeiro numero: ");
	valor1 = sc.nextDouble();
	System.out.print("Digite o segundo numero: ");
	valor2 = sc.nextDouble();
	sc.nextLine();
	System.out.println("Escolha qual operacao voce deseja fazer:");
	System.out.print("[1]Adicao | [2]Subtracao | [3]Divisao | [4]Multiplicacao ");
		
	int valorOperacao = sc.nextInt();

	if (valorOperacao == 1) {
		resultado = valor1 + valor2;
		System.out.println(valor1 + " + " + valor2 + " = " + resultado);
	}
	else if (valorOperacao == 2) {
		resultado = valor1 - valor2;
		System.out.println(valor1 + " - " + valor2 + " = " + resultado);
	}
	else if (valorOperacao == 3) {
		resultado = valor1 / valor2;
		System.out.println(valor1 + " / " + valor2 + " = " + resultado);
	}
	else if (valorOperacao == 4) {
		resultado = valor1 * valor2;
		System.out.println(valor1 + " X " + valor2 + " = " + resultado);
	}
	else  {
		System.out.println("Valor digitado invalido. Tente novamente.");
	}
	   
	
	sc.close();
			
 }
	} 
