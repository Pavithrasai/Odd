import java.io.*;
import java.util.*;
import java.lang.*;
class Odd
{
   public static void main(String args[])
   {		
   int i;
   int n;
   System.out.println("Enter the two intervels");
   Scanner sc=new Scanner(System.in);
   i=sc.nextInt();
   n=sc.nextInt();
   for(int j=i;j<=n;j++)
   {
   if(j%2==1)
   {
   System.out.println("The output is");
   System.out.println(+j);
   }
   }
   }
   }
   
