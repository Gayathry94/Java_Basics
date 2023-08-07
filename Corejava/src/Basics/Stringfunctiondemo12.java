package Basics;

public class Stringfunctiondemo12 {
	public static void main(String[] args) {
		String name=new String("abc");
//		this string is immutable
		name=name+"d";
//		now the string is mutable
		System.out.println(name);
		
	}

}
