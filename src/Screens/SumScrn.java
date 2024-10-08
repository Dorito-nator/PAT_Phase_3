package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class SumScrn extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    public static boolean closed = false;
    public static boolean Correct = true;
    public static int awnser;

    public SumScrn() {
        String sometihng = "";

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

        panel1.setPreferredSize(new Dimension(100, 10));
        panel2.setPreferredSize(new Dimension(10, 100));
        panel3.setPreferredSize(new Dimension(10, 100));
        panel4.setPreferredSize(new Dimension(100, 10));
        panel5.setPreferredSize(new Dimension(100, 100));

        Random rnd = new Random();

        var num1 = rnd.nextInt(-100,100);
        var num2 = rnd.nextInt(-100, 100);

        String question = "";

        if(SelectionScrn.choice == "Addition"){
            question = num1 + " + " + num2;
            awnser = num1 + num2;
        }if(SelectionScrn.choice == "Subtraction") {
            question = num1 + " - " + num2;
            awnser = num1 - num2;
        }if(SelectionScrn.choice == "Multiplication"){
            question = num1 + " x " + num2;
            awnser = num1 * num2;
        }if(SelectionScrn.choice == "Division"){
            question = num1 + " ÷ " + num2;
            awnser = num1 / num2;
        }

        JLabel label = new JLabel();
        label.setText(question);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 10, 500, 50);
        label.setForeground(Color.WHITE);
        label.setFont(new Font(null, Font.PLAIN,20));

        button = new JButton();
        button.setBounds(200, 150, 80,40);
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setPreferredSize(new Dimension(250,40));
        textField.setBounds(150,100,180,25);
        textField.setSelectedTextColor(Color.CYAN);



        //Button
        this.add(button);
        //textField AKA InputBox
        this.add(textField);
        //label
        this.add(label);
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(panel3, BorderLayout.WEST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);
        //frame visibility
        this.setVisible(true);
    }

    public void run(){

        while(closed == false){
            String Uawnser = textField.getText();
            String RAwnser = Integer.toString(awnser);

            if(Objects.equals(Uawnser, RAwnser)){
                Correct = true;
            }else {
                Correct = false;
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            closed = true;
        }
    }
}
