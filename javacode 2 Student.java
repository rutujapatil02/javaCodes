class Student
{
 public static void main(String args[])
 {
    int m=2;
     int sum=0;
     int res=0;
    int count=0;
   int arr[][]={{55,60,45,50},{20,30,40,50}};
   for(int i=0;i<m;i++)
  {
   for(int j=0;j<m;j++)
    {
      sum=(sum+arr[i][j]);
      res=sum/3;
	
}
   
  
//System.out.println(res);
if(res>50)
 {
  count++;


}
}
sum=0;
System.out.println(count);
}
}