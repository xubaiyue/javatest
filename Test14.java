package com.neuedu.test.chapter3;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断一个数是不是质数（素数），除了1和本身之后，不能被其他数整除。
		
		int n=179;
		for(int i=2;i<1;i++)
		{
			if(n%i==0)
			{
				System.out.println("不是素数");
				return;
			}
		}
		System.out.println("是素数");

	}

}
