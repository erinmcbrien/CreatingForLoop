/*
 * Erin McBrien
 * 09/10/2019
 * Creating for Loops
 */

package creatingforloops;
  import  java.util.Scanner;
/**
 *
 * @author ERMcB6406
 */
public class CreatingForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
       //output
        System.out.println("---Cool Counting Program---");
        System.out.println("Please enter your choice:\n"
                + "1... Count from 0 to 10 by 1\n" 
                + "2... Count from 100 to 0 by 10\n" 
                + "3... Count from 50 to 500 by 50\n" 
                + "4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        //user input
        String answer;
        answer = keyedInput.nextLine();
        //output based on user input
        switch (answer) {
            case "1":
                for (int i = 0; i<=10; i++)
                    System.out.println(i);
                break;
            case "2":
                for (int i = 0; i<=100; i=i+10)
                    System.out.println(i);
                break;
            case "3":
                for (int i = 50; i<=500; i=i+50)
                    System.out.println(i);
                break;
            case "4":
                for (int i = 6000; i>=1000; i=i-1000)
                    System.out.println(i);
                break;
                    
        
        
    }
  }
}

