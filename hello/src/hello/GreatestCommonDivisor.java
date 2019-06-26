package hello;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
//		int gcd=1;
//		for(int i=1;i<=a && i<=b;i++)
//		{
//			if(a%i==0 && b%i==0)
//			{
//				gcd=i;
//			}
//		}
//		System.out.println(a+"和"+b+"最大公约数是"+gcd);
		
		int aa=a;
		int ab =b;
		while(b!=0)
		{
			int r = a%b;
			System.out.println(a+","+b+","+r);
			a=b;
			b=r;
		}
		System.out.println(aa+"和"+ab+"最大公约数是"+a);

	}

}
