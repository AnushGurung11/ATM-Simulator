
/*
Using swing and awt for the user interface
Going to create a json file foe storing all the account details
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMInterface {
    public static void main(String[] args){
        //TODO creating Frame for the landing page
        //TODO creating buttons for deposit, withdraw, Create new account

        JFrame frame = new JFrame("ATM-Simulator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(1080, 720);

        //TODO Create 3 panels for the main frame
        JPanel header = new JPanel();
        JPanel body = new JPanel();
        JPanel footer = new JPanel();

        //TODO Setting properties for the panel
        header.setLayout(new FlowLayout());
        body.setLayout(new GridBagLayout());
        footer.setLayout(new FlowLayout());

        //TODO adding components in Header panel
        //Custom font
        Font headingFont = new Font("Serif", Font.BOLD, 24);

        //Header panel
        JLabel head = new JLabel("ATM Simulator");
        head.setFont(headingFont);

        //Adding the head in panel
        header.add(head);

        //TODO adding components in Body panel
        //Custom font for buttons
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        //Creating buttons
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton createButton = new JButton("Create Account");

        //Adding font
        depositButton.setFont(buttonFont);
        withdrawButton.setFont(buttonFont);
        createButton.setFont(buttonFont);

        //Create grid bag constrain
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx =0 ;
        gbc.gridy = 0;
        body.add(depositButton,gbc);
        gbc.gridy = 1;
        body.add(withdrawButton,gbc);
        gbc.gridy = 2;
        body.add(createButton,gbc);

        //TODO footer panel components
        JLabel foot = new JLabel("Informatics College Pokhara");
        foot.setFont(new Font("Arial", Font.BOLD, 16));
        footer.add(foot);

        //Creating event listener
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //TODO adding the panels in the main frame
        frame.add(header);
        frame.add(body);
        frame.add(footer);

    }


}
