import Screens.SelectionScrn;
import Screens.SumScrn;
import Screens.WelcomeScrn;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Main{

    public static void main(String[] args) {

        WelcomeScrn welcome = new WelcomeScrn();
        welcome.run();
        System.out.println("The program makes it past .run");

        SelectionScrn select = new SelectionScrn();
        System.out.println("The System Makes it ast the 2nd screen");
        select.run();

        //SumScrn sums = new SumScrn();

    }
}