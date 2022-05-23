package map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Map<String , String> cookies = new TreeMap<>();
		
		cookies.put("userName", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99111227");
		
		cookies.remove("email");
		cookies.put("phone", "11442");
		
		System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
		System.out.println("Phone numer: "+cookies.get("phone"));
		System.out.println("email: "+cookies.get("email"));
		System.out.println("Size: "+cookies.size());
		
		
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			
			System.out.println(key+ ": "+cookies.get(key));
		}

	}
}
