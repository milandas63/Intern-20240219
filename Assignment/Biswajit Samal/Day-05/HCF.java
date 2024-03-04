package com.Thirteen;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int hcf=1;
int a=2;
int b=4;
for(int i=1;i<=a && i<=b;i++)
{
	if(a%i==0 && b%i==0)
	{
	hcf=1;
	
	}
	System.out.println(hcf);
}
	}

}
