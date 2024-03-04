package com.Thirteen;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=7;
int y=0;
for(int i=1;i<=x;i++)
{
	if(x%i==0)
	{
		y++;
	}
}
if(y==2)
	System.out.println("prime no");
else
	System.out.println("not prime no");
	}

}
