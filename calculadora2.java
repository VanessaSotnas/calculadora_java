import java.util.Scanner;

public class calculadora2 {

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
	System.out.print("[1]Adicao | [2]Subtracao | [3]Multiplicacao | [4]Divisao ");
	
	int valorOperacao = sc.nextInt();
	
	switch (valorOperacao) {
	
	case 1:
		resultado = valor1 + valor2;
		System.out.println("Resultado: " + valor1 + " + " + valor2 + " = " + resultado);
		break;
	case 2:
		resultado = valor1 - valor2;
		System.out.println("Resultado: " + valor1 + " - " + valor2 + " = " + resultado);
		break;
	case 3:
		resultado = valor1 * valor2;
		System.out.println("Resultado: " + valor1 + " X " + valor2 + " = " + resultado);
		break;
	case 4:
		resultado = valor1 / valor2;
		System.out.println("Resultado: " + valor1 + " / " + valor2 + " = " + resultado);
		break;
	}
			
	sc.close();
		
	}

}
