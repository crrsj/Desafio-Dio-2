package desafioContador.contador;

import java.util.Scanner;

public class Contador {

	   public static void main(String[] args) {
	        Scanner terminal = new Scanner(System.in);
	        System.out.println("Digite o primeiro parâmetro");
	        int parametroUm = terminal.nextInt();  // Lendo o primeiro parâmetro
	        System.out.println("Digite o segundo parâmetro");
	        int parametroDois = terminal.nextInt();  // Lendo o segundo parâmetro
	        
	        try {
	            // Chamando o método contendo a lógica de contagem
	            contar(parametroUm, parametroDois);
	        } catch (ParametrosInvalidosException exception) {
	            // Imprimindo a mensagem de exceção personalizada
	            System.out.println(exception.getMessage());
	        }
      }
	   
	   static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	        // Validando se parametroUm é MAIOR que parametroDois e lançando a exceção
	        if (parametroUm > parametroDois) {
	            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	        }
	        
	        int contagem = parametroDois - parametroUm;
	        // Realizando o loop para imprimir os números com base na variável contagem
	        for (int i = 1; i <= contagem; i++) {
	            System.out.println("Imprimindo o número " + i);
	        }
	    }
	}
	 
