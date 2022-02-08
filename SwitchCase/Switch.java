package SwitchCase;
import java.util.Scanner;
public class Switch{
    public static void main(String args[])
    {
        Scanner objScan=new Scanner(System.in);

        /*int choice =Integer.parseInt(args[0])*/ 
        int choice;
        
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter Choice:");
        choice =objScan.nextInt();

        switch(choice){
            case 1:
                    Add objAddi=new Add();
                    objAddi.addition();
                    break;
            case 2:
                    Sub objSub=new Sub();
                    objSub.Subtraction();
                    break;
            case 3:
                    Mul objMul=new Mul();
                    objMul.Multiplication();
                    break;
            case 4:
                        Div objDiv=new Div();
                        objDiv.Division();
                        break;
            default:
                        System.out.println("Invalid Value.......");

        }//end of switch
    }
}//end of public class

class Add{
    int a,b,c;
    public Add(){
        System.out.println(".......Addition......");

        a=10;
        System.out.println("A="+a);

        b=114;
        System.out.println("B="+b);

    }//end of constructor
    public void addition(){
        
        c=a+b;
        System.out.println("Sum="+c);
    }//end of add method
}//end class A

class Sub{
    int a,b,c;
    public Sub(){
        System.out.println(".......Substraction......");

        a=500;
        System.out.println("A="+a);

        b=114;
        System.out.println("B="+b);

    }//end of constructor
    public void Subtraction(){
        
        c=a-b;
        System.out.println("Sub="+c);
    }//end of add method
}//end class B

class Mul{
    int a,b,c;
    public Mul(){
        System.out.println(".......Multiplication......");
        a=123;
        System.out.println("A="+a);

        b=11;
        System.out.println("B="+b);

    }//end of constructor
    public void Multiplication(){
        
        c=a*b;
        System.out.println("Mul="+c);
    }//end of add method
}//end class A

class Div{
    int a,b,c;
    public Div(){
        System.out.println(".......Division......");
        a=123;
        System.out.println("A="+a);

        b=11;
        System.out.println("B="+b);

    }//end of constructor
    public void Division(){
        
        c=a/b;
        System.out.println("Div="+c);
    }//end of add method
}//end class A
