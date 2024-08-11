package Screens;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultsScrn extends JFrame implements ActionListener {

    JButton button;


    public static boolean closed = false;
    public static int correct ;
    public static int incorrect ;

    public ResultsScrn(){
        this.setResizable(false);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.CYAN);
        panel4.setBackground(Color.CYAN);
        panel5.setBackground(Color.DARK_GRAY);

        panel1.setPreferredSize(new Dimension(100,10));
        panel2.setPreferredSize(new Dimension(10,100));
        panel3.setPreferredSize(new Dimension(10,100));
        panel4.setPreferredSize(new Dimension(100,10));
        panel5.setPreferredSize(new Dimension(100,100));

        JLabel label = new JLabel();
        label.setText("Results \n Correct: " + correct + "\n Incorrect: " + incorrect);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 10, 500, 50);
        label.setForeground(Color.WHITE);
        label.setFont(new Font(null, Font.PLAIN,20));


        button = new JButton();
        button.setBounds(200, 140, 80,40);
        button.setText("Done");
        button.setFocusable(false);
        button.addActionListener(this);


        //button
        this.add(button);
        //Panels
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(panel3, BorderLayout.WEST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);
        //frame visibility
        this.setVisible(true);

    }
    public void run(){
        while(!closed){

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            closed = true;
        }

    }
}
