package cm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {



	public static void main(String[] args) {




		List<Integer> nums = Arrays.asList(1,2,43,2,345,8);	


		  int secondLargest =  nums.stream()
				                  .distinct()
			                   	  .sorted(Comparator.reverseOrder())
				                  .skip(1)
				                  .findFirst()
				                  .orElse(0);


		System.out.println(secondLargest);
		System.out.println("=============");



		int[] numbarra = new int[] {1,2,3,4,5};


		int secondSmallest =  Arrays.stream(numbarra)
                                   .distinct()
             	                   .sorted()
                                   .skip(1)
                                   .findFirst()
                                   .orElse(0);

		System.out.println(secondSmallest);
	}

}
