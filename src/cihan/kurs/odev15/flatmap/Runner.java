package cihan.kurs.odev15.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class Runner {
	public static void main(String[] args) {
		String[][] a= {{"a","b"},{"a","d"},{"e","f"}};
		Stream<String[]> temp = Arrays.stream(a);
		Stream<String> stream=temp.flatMap(x->Arrays.stream(x)).filter(x->"a".equals(x.toString()));
		stream.forEach(System.out::println);
		
//		Stream<String> stream = Arrays.stream(a)
//                .flatMap(x -> Arrays.stream(x))
//                .filter(x -> "a".equals(x.toString()));
//		stream.forEach(System.out::println);
	}

}
