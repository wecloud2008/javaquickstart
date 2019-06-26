package hello;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PASS=60;
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		System.out.println("你输入的成绩是"+score);
		if(score<PASS)
			System.out.println("很遗憾，这个成绩没有及格");
		else
		{
			System.out.println("祝贺你，这个成绩及格了");
			System.out.println("再见");
		}
	}

}
