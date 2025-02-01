import java.util.*;
class TableUser
{
 public static void main(String args[])
 {
  System.out.println("1.Enter the no which you want to display table. \n 2. Enter the no that you want to in between table. \n 3.exit");
  Scanner S=new Scanner(System.in);
  int a=S.nextInt();
  int m=S.nextInt();
  int n=S.nextInt();
  int i;
   do{
       if(m==1)
       {
         for(i=1;i<=10;i++)
         { 
           System.out.println(a +" * "+ i+ " ="+ a * i);
         }
     }
       
   }while(i<=10);
 }
}

