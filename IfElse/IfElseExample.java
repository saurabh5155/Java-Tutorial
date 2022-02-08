package IfElse;
public class IfElseExample{
    public static void main(String args[])
    {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            if(a>b)
            {
                System.out.println("A is big");
            }//end of if
            else{
                System.out.println("B is big");
                
            }//end of else
        }//end of try
        catch(ArrayIndexOutOfBoundsException e){
                        
                        System.out.println("Enter minimum Two values......");
                        e.printStackTrace();
        }//end of catch
        catch(NumberFormatException e){
                        System.out.println("Enter only number.......");
                        
        }//end of catch
        catch(Exception e){
                        System.out.println("Error.................................................");

        }//end of catch
        
    }//end of main
}//end of main class