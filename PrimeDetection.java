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
        testMode = inputStr(testModeValidStrings, "Would you like to 'check', or 'generate' : ");

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
     * Take and validate inputs with a finite number of acceptable states
     * Those states are given as parameters
     * The question to ask is also a parameter
     */
    public static String inputStr(String[] validInput, String inpQuestion){
        Console keyboardConsole = System.console();
        String inp;

        //Ask the question until a valid answer is given
        do{
            inp = keyboardConsole.readLine(inpQuestion);
        } while(!Arrays.asList(validInput).contains(inp));

        return inp;
    }

    /*
     * Identifies whether a number is prime or not
     */
    public static void check(){}

    public static void gen(){}
}