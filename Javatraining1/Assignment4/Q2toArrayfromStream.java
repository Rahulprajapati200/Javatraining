package Assignment4;

import java.util.Arrays;
import java.util.stream.Stream;

//	toArray() method returns an array containing the elements of the given stream.
public class Q2toArrayfromStream {
	public static void main(String[] args) {
		Stream<String> tokenStream = Arrays.asList("A", "B", "C", "D").stream();  //This is a stream
	     
		String[] tokenArray = tokenStream.toArray(String[]::new);   //COnverted To array
		 
		System.out.println(Arrays.toString(tokenArray));
	}
}

