package exercicio_fixacao.application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import exercicio_fixacao.entities.Course;
import exercicio_fixacao.entities.Teacher;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//instanciando teacher
		Teacher teacher = new Teacher("Alex");
		
		//instanciando courses
		Course courseA =new Course("A", new HashSet<>());
		Course courseB =new Course("B", new HashSet<>());
		Course courseC =new Course("C", new HashSet<>());
		
		teacher.addList(courseA);
		teacher.addList(courseB);
		teacher.addList(courseC);
	
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			courseA.getSet().add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			courseB.getSet().add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			courseC.getSet().add(number);
		}
		
		Set<Integer> total = courseA.getSet();
		total.addAll(courseB.getSet());
		total.addAll(courseC.getSet());

		System.out.println("Total students: " + total.size());

		sc.close();

	}

}
