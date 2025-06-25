
/*
Using swing and awt for the user interface
Going to create a json file foe storing all the account details
 */

import javax.swing.*;
import javax.swing.text.Style;
import java.awt.*;

public class Interface {
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

        //TODO adding components in the panels

        //Custom font
        Font headingFont = new Font("Serif", Font.BOLD, 24);

        //Header panel
        JLabel head = new JLabel("ATM Simulator");
        head.setFont(headingFont);

        //Adding the head in panel
        header.add(head);


        //TODO adding the panels in the main frame
        frame.add(header);
        frame.add(body);
        frame.add(footer);




    }
}
