package Assignment4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Q5MinAndMaxInStream {
  public static void main(String[] args) {
	System.out.println("---Min and Max for Integer---");
		List<Integer> numList = Arrays.asList(42, 44, 43, 41);

		Comparator<Integer> comparator = Comparator.comparing(Integer::intValue);

		Optional<Integer> minOptional = numList.stream().min(comparator);
		minOptional.ifPresent(e -> System.out.println("Min: " + e));

		Optional<Integer> maxOptional = numList.stream().max(comparator);
		maxOptional.ifPresent(e -> System.out.println("Max: " + e));
		
		System.out.println("---Min and Max for String---");
		List<String> list = Arrays.asList("Prem", "Ujjwal", "Vishesh", "Rahul");
		list.stream().min(Comparator.comparing(String::valueOf))
		   .ifPresent(e -> System.out.println("Min: " + e));

		list.stream().max(Comparator.comparing(String::valueOf))
		   .ifPresent(e -> System.out.println("Max: " + e));
  }
} 