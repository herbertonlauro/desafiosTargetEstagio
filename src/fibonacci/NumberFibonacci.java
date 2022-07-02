package fibonacci;

import java.util.Scanner;

public class NumberFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = 0,num2 = 1, num3 = 0,res;
	
		System.out.println("Informe um número para verificar Fibonacci: ");
		res = scanner.nextInt();
		while (res > num3) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		if (res == 0) {
			System.out.println("Número 0 está na Fibonacci. O 1 é o próximo da sequęncia.");
		} else if (res == num3) {
			System.out.println("O número " + res + ", está na Fibonacci. O próximo numero é " + (num1 + res));
		} else {
			System.out.println("O número digitado năo se enquadra na Fibonacci!.");
		}
		for(int i = 0; i < res; i++){
            num2 = num2 + num1;
            num1 = num2 - num1;
            System.out.println(num2);
         	}
		scanner.close();
	}

	}

