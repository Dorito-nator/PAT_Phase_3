package Screens;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class WelcomeScrn extends JFrame implements ActionListener{

    //global variables
    JButton button;
    JTextField textField;
    public static String Name;
    //"closed" variable mentioned in @Main
    public static boolean closed = false;

    public WelcomeScrn(){

        //Frame attributes Resizability Size etc.
        this.setResizable(false);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        //Creates panels for borders
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //panel colours
        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.CYAN);
        panel4.setBackground(Color.CYAN);
        panel5.setBackground(Color.DARK_GRAY);

        //panel sizes
        panel1.setPreferredSize(new Dimension(100,10));
        panel2.setPreferredSize(new Dimension(10,100));
        panel3.setPreferredSize(new Dimension(10,100));
        panel4.setPreferredSize(new Dimension(100,10));
        panel5.setPreferredSize(new Dimension(100,100));


        //Labels AKA the text you see in the screen
        JLabel label = new JLabel();
        label.setText("Whats Your Name?");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 10, 500, 50);
        label.setForeground(Color.WHITE);
        label.setFont(new Font(null, Font.PLAIN,20));

        //textField AKA the Input Box
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setPreferredSize(new Dimension(250,40));
        textField.setBounds(150,50,200,50);
        textField.setSelectedTextColor(Color.CYAN);

        //Button AKA ... the button you press
        button = new JButton();
        button.setBounds(200, 110, 80,40);
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        // add features to the frame
        //Labels
        this.add(label);
        //button
        this.add(button);
        //Text Fields
        this.add(textField);
        //Panels
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(panel3, BorderLayout.WEST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);
        //frame visibility
        this.setVisible(true);

    }
    // Run makes teh program to wait unil the button feature on each screen has been pressed before moving on in @Main
     public void run(){
        while(!closed){
            Name = textField.getText();
        }
     }
     //Listens For something to happen on the screen
    @Override
    public void actionPerformed(ActionEvent e) {
        //checks if the button has been pressed
        if(e.getSource()== button){

            closed = true;
            //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
}
