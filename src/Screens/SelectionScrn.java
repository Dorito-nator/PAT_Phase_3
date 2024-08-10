package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class SelectionScrn extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JComboBox comboBox;
    JLabel numSumsText;
    public static Object choice;
    public static String NumSum;


    public SelectionScrn(){
        this.setResizable(false);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        //this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setLayout(null);

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
        label.setText("What math operand would you like to use? " + WelcomeScrn.Name);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 10, 500, 50);
        label.setForeground(Color.WHITE);
        label.setFont(new Font(null, Font.PLAIN,20));

        numSumsText = new JLabel();
        numSumsText.setText("And how many sums?");
        numSumsText.setHorizontalAlignment(JLabel.CENTER);
        numSumsText.setBounds(0, 80, 500, 50);
        numSumsText.setForeground(Color.WHITE);
        numSumsText.setFont(new Font(null, Font.PLAIN,20));

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setPreferredSize(new Dimension(250,20));
        textField.setBounds(150,120,200,20);
        textField.setSelectedTextColor(Color.CYAN);

        comboBox = new JComboBox<>();
        comboBox.setBounds(150, 60, 200, 20);
        comboBox.addItem("Addition");
        comboBox.addItem("Subtraction");
        comboBox.addItem("Multiplication");
        comboBox.addItem("Division");

        button = new JButton();
        button.setBounds(200, 150, 80,40);
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        //Labels
        this.add(label);
        //NumSumText
        this.add(numSumsText);
        //ComboBox
        this.add(comboBox);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            choice = comboBox.getSelectedItem();
            NumSum = textField.getText();
            //System.out.println(choice);
            //System.out.println(NumSum);

            //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
}
