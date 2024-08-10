package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumScrn extends JFrame implements ActionListener {

    JButton button;
    public SumScrn() {
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

        panel1.setPreferredSize(new Dimension(100, 10));
        panel2.setPreferredSize(new Dimension(10, 100));
        panel3.setPreferredSize(new Dimension(10, 100));
        panel4.setPreferredSize(new Dimension(100, 10));
        panel5.setPreferredSize(new Dimension(100, 100));

        button = new JButton();
        button.setBounds(200, 150, 50,40);
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        //Panels
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(panel3, BorderLayout.WEST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);
        //button
        this.add(button);
        //frame visibility
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
