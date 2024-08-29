import Screens.ResultsScrn;
import Screens.SelectionScrn;
import Screens.SumScrn;
import Screens.WelcomeScrn;


public class Main{

    //variables for counting the number of sums answered correctly
    public static int correct = 0;
    public static int incorrect = 0;

    public static void main(String[] args) {
        //runs the screens See methods for details
        // println's used for debugging
        WelcomeRun();
        System.out.println("The program makes it past Welcome Screen");
        SlectRun();
        System.out.println("The System Makes it past selection screen");

        //for loop to create the amount of sums chosen by the users
        int nums = Integer.parseInt(SelectionScrn.NumSum);
        for (int i = 0; i < nums ; i++) {
            //sum screen and println for debugging
            SumScrn sums = new SumScrn();
            System.out.println("sums");
            //checks if the answer entered by the user is correct or incorrect then itterates each var respectively
            if (SumScrn.Correct){
                correct++;
            }else{
                incorrect++;
            }
            //resets the "closed" variable
            SumScrn.closed = false;
            sums.run();

        }
        //result screen
        ResultsRun();

    }
    //methods to create screens
    public static void WelcomeRun(){
        WelcomeScrn welcome = new WelcomeScrn();
        welcome.run();
    }
     public static void SlectRun(){
         SelectionScrn select = new SelectionScrn();
         select.run();
     }

     public static void ResultsRun(){
         ResultsScrn result = new ResultsScrn(correct, incorrect);
         result.run();
     }
}