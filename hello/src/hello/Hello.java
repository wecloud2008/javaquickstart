package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���");
		
		Scanner in =new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
		int amount=100; //final ����
		int price=0;
		System.out.print("������Ʊ��:");
		amount = in.nextInt();
		System.out.print("��������:");
		price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}
