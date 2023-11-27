package Mode;

import java.util.ArrayList;
import java.util.List;

public class Hello {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(18);
		
		list.add(23);
		list.add(15);
		
		list
		.stream()
		.filter(number -> number%2==0)
		.forEach(System.out::println);
		
	
		
	}
}