/*Enter a number to see whether it's palindrome or not*/

import java.util.Scanner;

public class IsPalindromeNumber{  
    public static void main(String args[]){ 
        while(true){ 
            System.out.println("Please enter an integer number"+
            " to check if it's palindrome :");
            Scanner input = new Scanner(System.in);
            int inputNumber = input.nextInt();
            if(isPalindromeNumberChecker(inputNumber)){
                System.out.println(inputNumber + " is a palindrome number.");    
            }
            else{   
                System.out.println(inputNumber + " is not a palindrome number.");
            }  
            System.out.println("*********************************************************");
        }  
    } 
    
    public static boolean isPalindromeNumberChecker(int number){
        int r, sum = 0, temp;
        temp = number;    
            while(temp>0){    
                r = temp%10;  //getting remainder  
                sum = (sum*10)+r;    
                temp = temp/10;    
            }    
            if(number == sum){
                return true;
            }
            else{
                return false;
            }
    }
}  


// by Arman Azarnik
// armanazarnik@gmail.com