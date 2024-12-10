package cm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {


		List<String> fruits = Arrays.asList("apple","orange","pineapple","berry","strawberry","kiwi","berry","kiwi");	


		System.out.println("convert String to uppercase and sort reverse order");
		System.out.println();

		fruits.stream()      
		      .map(str->str.toUpperCase())   // lambda expression
		      .sorted(Comparator.reverseOrder())
		      .forEach(str->System.out.println(str));  // lambda expression

		System.out.println("get the list of string where the length is >5 ");
		System.out.println();
		
		fruits.stream()      
	          .filter(str->str.length()>5)
		      .forEach(str->System.out.println(str)); 
		
		System.out.println("Remove duplicates from the list ");
		System.out.println();
		
		fruits.stream()      
              .distinct()
	          .forEach(str->System.out.println(str)); 
	
		System.out.println("get the list of string particular word");
		System.out.println();
		
		fruits.stream()      
              .filter(str->str.contains("berry"))   //filter(str->str.contains("b")) 
	          .forEach(str->System.out.println(str)); 
	
		
		System.out.println("remove the word starting with b");
		System.out.println();
		
		
		fruits.stream()      
        .filter(str->!str.contains("b"))   
        .forEach(str->System.out.println(str)); 
		
		
		
		System.out.println("find the first element starts with p");
		System.out.println();
		
		
String s2=fruits.stream()      
               .filter(str->str.startsWith("p")) 
               .findFirst()            // optional
               .get();

System.out.println(s2.toUpperCase());

Optional<String> s1=fruits.stream()      
                  .filter(str->str.startsWith("r")) 
                  .findFirst();            // optional

	
	System.out.println(s1);
	
	
	
	System.out.println("get the length of each name in list");
	System.out.println();
	
	fruits.stream()
	      .map(str->str.length())
	      .sorted()
	      .forEach(str->System.out.println(str));
	
	
	System.out.println();
	System.out.println("**********************");
	System.out.println("Intermediate Operations");
	
	
	fruits.stream()
	      .sorted(Comparator.reverseOrder())  // reverse alphabet
	      .forEach(str->System.out.println(str));
	
	
	System.out.println();
	
// compareTo methods checks objects only	
	
	fruits.stream()
    .sorted((o1, o2)->((Integer)o1.length()).compareTo(o2.length()))   // your logic            
    .forEach(str->System.out.println(str)); 
	
	
	
	
     // .sorted((o1, o2)->((Integer)o1.length()).compareTo(o2.length()))    your logic
	//  .sorted(Comparator.comparing(str->str.length()))                    in built method
	//  .sorted(Comparator.comparing(String::length).reversed())            in built reverse method
	
	
	
	
	System.out.println("find longest String in the list");
	
	Optional<String> o = fruits.stream()
	                          // .max(Comparator.comparing(String::length));
	                           .max(Comparator.comparing(str -> str.length()));
	System.out.println(o);
	       
	
	
	}

}
