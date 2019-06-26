package hello;

import java.util.Scanner;

public class ArrayErgodic {

	//线性搜索
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] data = {3,2,5,7,4,9,11,34,32,28};
		int x =in.nextInt();
		int loc=-1;
		boolean found =false;
		for(int i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc=i;
				break;
			}			
		}
		for(int k:data) //类型 变量 数组
		{
			if(k==x)
			{
				found=true;
			}
		}
		
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"不在其中");
		}

	}

}
