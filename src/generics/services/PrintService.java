package generics.services;

import java.util.ArrayList;

public class PrintService <T>{

	private ArrayList<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T fist() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");

		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[ ");
		if (list.isEmpty()) {
			System.out.println(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
			if(i==0) {
				System.out.print( list.get(i));
			}else {
			System.out.print(", " + list.get(i));}
		}
		System.out.print(" ]");
	}

}
