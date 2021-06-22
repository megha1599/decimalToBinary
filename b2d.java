import java.io.*;
import java.util.*;
class DecimalToBinary 
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int decimal= sc.nextInt();
        int binary[]= new int[40];
        int index = 0;
        try
        {
            while(decimal >0 )
            {
                binary[index++]=decimal %2;
                decimal= decimal/2;
            }
            for(int i=index-1;i>=0;i--)
            {
                System.out.print(binary[i]);
            }
            System.out.println();
            
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("please enter positive number");
        }
    }
}
        
        
       
                