/*
i=0 k j=0 o/p
5   1  1     *
4   2  1    ** 
           ***
          ****
         ***** 
*/
package ForLoop;
import java.util.*;
public class For1{
    public static void main(String args[])
    {
            Scanner objScan=new Scanner(System.in);
            C obj= new C();
            obj.forexample1();
            obj.forexample2();
            obj.forexample3();


    }//end of main
}//end of main class
class A
{
        int row,col;
        public void forexample1(){
                    Scanner objscan=new Scanner(System.in);
                    
                    System.out.print("Enter N:");
                    int n=objscan.nextInt();

                    for(col=0;col<=n;col++)
                    {
                        for(row=0;row<col;row++)
                        {
                            System.out.print("*");
                        }//end of inner for
                        System.out.print("\n");
                    }//end of outerfor
       }//end of forexample1

}//end of class A

class B extends A
{
    int i,j,n;
    public void forexample2()
    {
        Scanner objscan =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=objscan.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }//end of inner
            System.out.println();
        }//end of outr for

    }
}

class C extends B
{
    int row,col,k,n;
    public void forexample3()
    {
        Scanner objscan =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=objscan.nextInt();
            
        for(col=0;col<=n;col++)
                    {
                        for(row=0;row<col;row++)
                        {
                            System.out.print("\n");
                            for(k=0;k<5;k++)
                            {
                            System.out.print("*");
                            }
                        }//end of inner for
                        System.out.print("\n");
                    }//end of outerfor

    }
}