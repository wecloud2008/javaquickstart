package hello;

import java.util.Scanner;

public class PackageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("abc\bd");
		
		int i=10;
		Integer k=10;
		k=i;
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.isDigit('D'));
		
		System.out.println(Math.abs(-12));
		System.out.println(Math.abs(10.645));
		System.out.println(Math.pow(2,3.2));
		System.out.println(Math.round(10.645));
		System.out.println(Math.random()*100);
		
		String s = new String("Hello");
		System.out.println(s+" world");
		System.out.println(s+(12+24));
		
		s=in.next();
		System.out.println(s.equals("bye")); //equals 判断内容是否相同 
		
//		1.创建一个String对象
//		2.用"a string" 初始化这个对象
//		3.创建管理这个对象的变量s
//		4.让s管理这个对象
		//String a =new String("a string");
	}

}
