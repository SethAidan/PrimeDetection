import java.io.Console;
import java.util.Arrays;

public final class InputHandling {
    /*
     * Handles string inputs where a finite number of acceptable inputs exist
     */
    public static String inputStrFin(String[] validInput, String inpQuestion){
        Console keyboardConsole = System.console();
        String inp;

        // Ask the question until a valid answer is given
        do{
            inp = keyboardConsole.readLine(inpQuestion);
        } while(!Arrays.asList(validInput).contains(inp));

        return inp;
    }

    /*
     * Handles integer inputs in a specific range
     */
    public static int inputIntRng(String inpQuestion, int min, int max){
        Console keyboardConsole = System.console();
        String keyboardRead;
        Boolean valid;
        int inp = 0;

        // Ask the question until a valid input is given
        do{
            valid = false;
            keyboardRead = keyboardConsole.readLine(inpQuestion);
            try{
                inp = Integer.parseInt(keyboardRead);
                if(inp <= max && inp >= min){
                    valid = true;
                }
                else{
                    System.out.println(String.format("Please enter a number in the range %d <= x <= %d", min, max));
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a valid integer value");
            }
        } while(!valid);

        return inp;
        
    }
}
