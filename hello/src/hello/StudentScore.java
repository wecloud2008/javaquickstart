package hello;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PASS=60;
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		System.out.println("������ĳɼ���"+score);
		if(score<PASS)
			System.out.println("���ź�������ɼ�û�м���");
		else
		{
			System.out.println("ף���㣬����ɼ�������");
			System.out.println("�ټ�");
		}
	}

}
