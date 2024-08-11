import Screens.ResultsScrn;
import Screens.SelectionScrn;
import Screens.SumScrn;
import Screens.WelcomeScrn;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Main{

    public static int correct = 0;
    public static int incorrect = 0;

    public static void main(String[] args) {
        WelcomeRun();
        System.out.println("The program makes it past Welcome Screen");
        SlectRun();
        System.out.println("The System Makes it past selection screen");

        int nums = Integer.parseInt(SelectionScrn.NumSum);
        for (int i = 0; i < nums ; i++) {
            SumScrn sums = new SumScrn();
            System.out.println("sums");
            if (SumScrn.Correct){
                correct++;
            }else{
                incorrect++;
            }
            SumScrn.closed = false;
            sums.run();

        }
        ResultsRun();

    }

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