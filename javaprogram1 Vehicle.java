import java.util.*;
public class Vehicle
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Vehicle");
  int v=sc.nextInt();
  System.out.println("Enter wheels");
 int w=sc.nextInt();
  int tw=0;
  int fw=0;
 if(2<=w && w%2==0 && v<w)
  {
  fw=(w-2*v)/2;
 System.out.println(fw);
 tw=v-fw;
 System.out.println(tw);
}
 else
{
   System.out.println("Invalid Input");
 }
}
}
  
