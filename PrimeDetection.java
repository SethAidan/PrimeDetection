/*
 * Investigate different methods for determining the primacy of numbers
 * 
 * Either by inputting a number and returning whether or not it is prime
 * 
 * ... Or by inputting a range of numbers and returning all the prime numbers in that range
 */
import java.io.Console;
import java.util.Arrays;

class PrimeDetection{
    public static void main(String[] args){
        //Declare constants
        String[] testModeValidStrings = {"check","generate","arb"};
        // Declare global attributes
        String testMode;

        // Stylized welcome message
        System.out.println("****************");
        System.out.println("Welcome");
        System.out.println("****************\n");

        // Choose testing mode - check primacy or generate primes
        System.out.println("You may either : ");
        System.out.println("check -> Enter a number and return whether is is prime, or,");
        System.out.println("generate -> Enter a range and receive all prime numbers in that range.\n");
        testMode = InputHandling.inputStrFin(testModeValidStrings, "Would you like to 'check', or 'generate' : ");

        // Call the appropriate subroutine depending on testMode
        switch(testMode){
            case "check":
                check();
                break;
            case "generate":
                gen();
                break;
            default:
                // Should never occur - exists for maintainability
                throw new UnacceptableInputException("User should not be able to enter a value other than 'check', or 'generate'");
        }
        
    }

    /*
     * Identifies whether a number is prime or not
     */
    public static void check(){
        int numToCheck = InputHandling.inputIntAny("Enter the number you want to check : ");
        Boolean prime = true;
        int i = 2;

        // No number less than or equal to 1 is prime
        if(numToCheck <= 1){
            prime = false;
        }
        else{
            // Loop from 2 to the sqrt of numToCheck
            while(i*i <= numToCheck){
                // If the number has even a single factor in this range it cnnot be prime
                if(numToCheck % i == 0){
                    prime = false;
                    break; // No need to continue iterating if a factor is found
                }
                i+=1;
            }
            // If no factor is found in that range then the number is prime
        }

        if(prime){
            System.out.println(String.format("%d is a prime number", numToCheck));
        }
        else{
            System.out.println(String.format("%d is not a prime number", numToCheck));
        }
    }

    /*
     * Find all the prime numbers in a range using Sieve of Eratosthenes
     * Iterate from 2 to sqrt(N) and eliminate all vlues that are a multiple of i
     * All remaining values are prime 
     */
    public static void gen(){}
}