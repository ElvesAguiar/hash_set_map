package generics.application;

import java.util.Scanner;

import generics.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService <String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String value = sc.nextLine();

			ps.addValue(value);

		}
		

		ps.print();
		System.out.println(" Fist: " + ps.fist());

		sc.close();
	}

}
