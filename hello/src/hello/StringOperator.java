package hello;

import java.util.Scanner;

public class StringOperator{

	//字符串变量
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		String s1="abc";
		String s2="abcd";
		String s3="0123456789我是中国人abcd";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.charAt(1));
		System.out.println("abcd");
		
		for(int i=0;i<s3.length();i++)
		{
			System.out.println(s3.charAt(i));
		}
	
		System.out.println(s3.substring(2,4));
		System.out.println(s3.indexOf('3'));
		s3.toUpperCase();
		System.out.println(s3);
		

	}

}
