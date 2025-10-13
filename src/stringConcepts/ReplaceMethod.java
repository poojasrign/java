package stringConcepts;

public class ReplaceMethod {
	public static void main(String[] args) {
		String st1= "Kavin is a excellent programmer in vcet. he is excellent";
		System.out.println(st1.replace("excellent","Worst"));
		System.out.println(st1.replaceFirst("excellent","Worst")); //replace only the first excellent
		System.out.println(st1.replaceAll("[aeiou]","*")); //replace all vowels into *
		System.out.println(st1.replaceAll("[aeiou]","")); //remove all vowels 
	}
}
