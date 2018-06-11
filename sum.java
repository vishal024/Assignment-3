import java.util.Scanner;
class Sum
{
public static int add(int x,int y)
{
    int z=x+y;
    return(z);
}
public static void main(String[] args)
{
  int s;
  Scanner vish=new Scanner(System.in);
  System.out.println("enter first number");
  int num1= vish.nextInt();
  System.out.println("enter second number");
  int num2=vish.nextInt();
  s=add(num1,num2);
  System.out.println("sum is:"+s);
  vish.close();
}
}