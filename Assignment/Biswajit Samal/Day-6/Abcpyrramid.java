package pyramid;

import java.util.Scanner;

public class Abcpyrramid {
	 public static void main(String[] args) 
     {
         int i,j,k;
              
         Scanner sc=new Scanner(System.in);
         
         System.out.print("Enter the row");
         int row = sc.nextInt();
        
         for(i=1;i<=row;i++)
         {
            
             for(j=i;j<=row;j++) System.out.print(" ");
             for(j=1;j<=i;j++) System.out.print((char)(j+64)+"");
             for(k=i-1;k>=1;k--)  System.out.print((char)(k+64)+"");
             System.out.println();
          }
       }
}
