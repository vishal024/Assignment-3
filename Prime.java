import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
 int n,i;
 Scanner s=new Scanner(System.in);
 System.out.println("enter the number");
 n=s.nextInt();
 for(i=2;i<n;i++)
 {
  if(n%i==0)
{
   break;
}
}
 if(i==n)
{
  System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}}