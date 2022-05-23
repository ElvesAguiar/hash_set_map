package exercicio_fixacao.entities;

import java.util.ArrayList;

public class Teacher {
	private String name;
	
	ArrayList<Course> list = new ArrayList<>();
	
	
	public Teacher() {
		
	}
	
	public Teacher(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addList (Course course) {
		list.add(course);
	}
	
	public void removeList (Course course) {
		list.remove(course);
	}
	
	public int totalNumberStudents() {
		int num=0;
		for(Course x : list) {
			num=num+x.getNumberStudents();
		}
		
		return num;
	}
}
