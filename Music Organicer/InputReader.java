  import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olav Rune
 */
public class InputReader {
    
 
    private Scanner reader;
    
    
    public InputReader()
    {
    
    }
    
    /**
     * Asks the user to provide his menu selection as a number from
     * 1 to max. The method tests that the input is kept within range,
     * and provides proper feedback to the user if not.
     *  
     * @param max The highest menu number to ask for
     * @return the number representing the menu selected by the user
     */
    private int getUserMenuSelection(int max) 
    {
        boolean validInput = false;
        int selection = 0;
 
        while (!validInput) {
            try {
                selection = reader.nextInt();
                if ((selection <= max) && (selection > 0)) {
                    validInput = true;
                } else
                {
                    System.out.print("You must provide a number between 1 and " 
                            + max + "\n>");
                }
            } catch (InputMismatchException ime) {
                System.out.print("Your input must be an integer (a positiv number)\n>");
                // Empty the Scanner
                reader.next();
            }
        }
        return selection;
    }
}

