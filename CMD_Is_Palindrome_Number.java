import java.util.Scanner;

/**Java CMD program for checking whether the entered number is palindrome or not.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Is_Palindrome_Number{  

    /** main class for interacting with the user */
    public static void main(String args[]){ 

        /** while loop to keep the program running */
        while(true){ 
            System.out.println("Please enter an integer number to check if it's palindrome :");
            Scanner input = new Scanner(System.in);

            /** reading the next integer number and storing it in input_Number integer variable */
            int input_Number = input.nextInt();
            if(is_Palindrome_Number_Checker(input_Number)){
                System.out.println(input_Number + " is a palindrome number.");    
            }
            else{   
                System.out.println(input_Number + " is not a palindrome number.");
            }  
            System.out.println("****************************************************************");
        }  
    } 

    /** 
     * method for checking wheather the input number is palindrome or not.
     * @param number  the input number
     * @return  boolean 
     * <pre>
     *      is_Palindrome_Number_Checker(131); // Output: true
     *      is_Palindrome_Number_Checker(45); // Output: false
     * </pre>
    */
    public static boolean is_Palindrome_Number_Checker(int number){
        int reminder, reverse_Number = 0, temp;
        temp = number;    
        while(temp>0){   

            /** calculating the reminder */ 
            reminder = temp % 10;   
            reverse_Number = (reverse_Number * 10) + reminder;    
            temp = temp / 10;    
        }    
        if(number == reverse_Number){
            return true;
        }
        else{
            return false;
        }
    }
}  