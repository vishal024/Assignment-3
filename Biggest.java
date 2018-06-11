import java.util.Scanner;
class Big
{
 public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the first number");
  int a=s.nextInt();
  System.out.println("enter the second number");
  int b=s.nextInt();
  System.out.println("enter the third number");
  int c=s.nextInt();
 if(a>b&a>c)
{
  System.out.println("Biggest number is:"+a);
} 
else if(b>a&b>c)
{
 System.out.println("Biggest number is:"+b);
}
else
{ 
System.out.println("Biggest number is:"+c);
}
s.close();
}
}