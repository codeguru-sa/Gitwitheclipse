package Mode;

import java.util.List;
import java.util.function.Predicate;

public class FP01Exersice {
	
	public static void main(String[] args) {
		List<String> newList = List.of("Spring","Spring boot","Microservices", "Structured Programming","Java","Node JS","AWS");
		
		//printAllCourses(newList);
		
		//printCourseWhichContainSpring(newList);
		
		printWhoseNameHasAtleast4Character(newList);
	}

	private static void printWhoseNameHasAtleast4Character(List<String> newList) {
		// TODO Auto-generated method stub
		Predicate<? super String> predicate = s -> s.length()>=4;
		
		newList.stream().filter(predicate).forEach(System.out::println);
	}

	private static void printCourseWhichContainSpring(List<String> newList) {
		// TODO Auto-generated method stub
		newList.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);
	}

	private static void printAllCourses(List<String> newList) {
		
		newList.stream().forEach(System.out::println);
		
	}

}
