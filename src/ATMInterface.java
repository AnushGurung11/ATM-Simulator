
/*
Using swing and awt for the user interface
Going to create a json file foe storing all the account details
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

public class ATMInterface {
    public static void main(String[] args){

        //Creating a main Array List Containing objects of Account
        ArrayList<Account> mainArray = new ArrayList<>();



        JFrame frame = new JFrame("ATM-Simulator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(1080, 720);


        JPanel header = new JPanel();
        JPanel body = new JPanel();
        JPanel footer = new JPanel();


        header.setLayout(new FlowLayout());
        body.setLayout(new GridBagLayout());
        footer.setLayout(new FlowLayout());


        //Custom font
        Font headingFont = new Font("Serif", Font.BOLD, 24);

        //Header panel
        JLabel head = new JLabel("ATM Simulator");
        head.setFont(headingFont);

        //Adding the head in panel
        header.add(head);


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


        JLabel foot = new JLabel("Informatics College Pokhara");
        foot.setFont(new Font("Arial", Font.BOLD, 16));
        footer.add(foot);

        //Creating event listener
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositMonet(mainArray);
            }
        });

        //for creating an account
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 createAccFrame(mainArray);
            }
        });


        frame.add(header);
        frame.add(body);
        frame.add(footer);

    }

    //Creating a method for the deposit withdraw and Create account
    public static void  createAccFrame(ArrayList<Account> array){
        JFrame frame1 = new JFrame("Create Account");
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLayout(new GridLayout(5,2));
        frame1.setSize(1080, 720);

        //creating label
        JLabel nameL = new JLabel("Name");
        JLabel accountL = new JLabel("Account Number");
        JLabel pinL = new JLabel("Pin");
        JLabel depositL = new JLabel("Deposit Amount");

        //Creating input fields
        JTextField nameF = new JTextField();
        JTextField accountF = new JTextField();
        JTextField pinF = new JTextField();
        JTextField depositF = new JTextField();

        //Creating a button for creating account
        JButton create = new JButton("Create");

        //Creating a non-editable text Area
        JTextArea info = new JTextArea("The minimum deposit must be Rs.500.");
        info.setEditable(false);

        //Adding Action listener for the create button
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Fetching all the data from the fields and storing in a variable
                String name = nameF.getText().toLowerCase();
                int accNumber = Integer.parseInt(accountF.getText());
                String pin = pinF.getText();
                double amount = Double.parseDouble(depositF.getText());


                //Creating a date and time object
                LocalDate currentDate = LocalDate.now();
                String date = currentDate.toString();

                //Now creating an object of account
                Account account1 = new Account(name, date, accNumber,pin, amount);
                array.add(account1);


            }
        });



        //Adding all components on the frame
        frame1. add(nameL);
        frame1.add(nameF);
        frame1.add(accountL);
        frame1.add(accountF);
        frame1.add(pinL);
        frame1.add(pinF);
        frame1.add(depositL);
        frame1.add(depositF);
        frame1.add(create);
        frame1.add(info);


    }
    //Creating method for depositing
    public static void depositMonet (ArrayList<Account> array){
        JFrame frame1 = new JFrame("Deposit Amount");
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLayout(new GridLayout(4,2));
        frame1.setSize(1080, 720);

        //Creating Labels
        JLabel accountNum = new JLabel("Account number ");
        JLabel pin = new JLabel("Pin  ");
        JLabel depositAmount = new JLabel("Deposit Amount ");

        //Creating fields
        JTextField accountF = new JTextField();
        JTextField pinF = new JTextField();
        JTextField depositF = new JTextField();

        //Creating button
        JButton depositButton = new JButton("Deposit");

        //Adding components on the frame
        frame1.add(accountNum);
        frame1.add(accountF);
        frame1.add(pin);
        frame1.add(pinF);
        frame1.add(depositAmount);
        frame1.add(depositF);
        frame1.add(depositButton);


        //Now adding event listener for when the deposit button is clicked
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO fetch the data from the fields
                //TODO checking the values form the ArrayList

            }
        });
    }



}
