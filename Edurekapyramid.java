public class Edurekapyramid
{  
    public static void main(String args[]) 
    {  
        for (int i=1; i<=5; i++) 
        { 
            for (int k=4; k>=i; k--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=1; j<=i; j++) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
    } 
}