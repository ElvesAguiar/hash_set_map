package exercicio_fixacao.entities;

import java.util.ArrayList;
import java.util.Set;

public class Course {
	private String name;
	private int numberStudents;
	private Set<Integer> set;

	ArrayList<Student> students = new ArrayList<>();

	public Course() {

	}
	

	public Course(String name, Set<Integer> set) {
		this.name = name;
		this.set = set;
		this.numberStudents = set.size();
	
	}


	public Course(String name, int numberStudents) {
		this.name = name;
		this.numberStudents = numberStudents;
	}

	public Course(String name) {
		this.name = name;
		this.numberStudents = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberStudents() {
		return numberStudents;
	}
	
	

	public Set<Integer> getSet() {
		return set;
	}


	public void setSet(Set<Integer> set) {
		this.set = set;
	}


	public void addStudent(Student student) {
		students.add(student);
		numberStudents++;
	}

	

	public void removeStudent(Student student) {
		students.remove(student);
	}

}
