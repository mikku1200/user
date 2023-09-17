package Utility;

import java.text.Collator;
import java.util.stream.Stream;

public class CodeTest {
	
	public static void main()
	{
		String s="aabbccde";
		s.chars().distinct().forEach(System.out::print);;
		
	}

}
