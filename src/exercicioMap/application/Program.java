package exercicioMap.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> candidates = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] filds = line.split(",");

				String name = filds[0];
				int count = Integer.parseInt(filds[1]);

				if (candidates.containsKey(name)) {
					int votesSoFar = candidates.get(name);
					candidates.put(name, count + votesSoFar);
				} else {
					candidates.put(name, count);
				}

				line = br.readLine();
			}
			System.out.println("Alex Blue: " + candidates.get("Alex Blue"));
			System.out.println("Maria Green: " + candidates.get("Maria Green"));
			System.out.println("Bob Brown: " + candidates.get("Bob Brown"));

		} catch (Exception e) {
			System.out.println("error:404" + e.getMessage());
		}

		sc.close();

	}
}
