import java.util.*;
class health
{
  public static void main(String args[])
  { 
  int n=4;
   int a[]={35,35,35,35};
  
   for(int i=0;i<n;i++)
   {
      int index=i;
   for(int j=0;j<n;j++)
   {
      if(index!=j)
      {
        a[j]=a[j]+1;
       }
     
  System.out.print(" "+a[j]);
}
  System.out.println();


}
}
}
