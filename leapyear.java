import java.util.Scanner;
class Leapyear
{
  public static void main(String[] args)
{
  int year;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a year");
  year=s.nextInt();
  if(year%4==0)
{
  System.out.println("not a leap year");
}
 else if(year%100==0)
{
 System.out.println("leap year");
}
else if(year%400==0)
{
System.out.println("not a leap year");
}  
else
{
System.out.println("leap year");
}
s.close();
}
}