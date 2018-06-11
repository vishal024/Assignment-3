import java.util.Scanner;
class Palindrome
{
 public static void main(String[] args)
{
int rev=0,rem,n,num;
Scanner s=new Scanner(System.in);
System.out.print("enter the number:");
n=s.nextInt();
num=n;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(rev==num)
{
System.out.println("given number "+num+"  is Palindrome");
}
else
{
System.out.println("given number "+num+" is not palindrome");
}
s.close();
}
}