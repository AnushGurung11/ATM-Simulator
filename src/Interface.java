
/*
Using swing and awt for the user interface

 */

import javax.swing.*;
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






    }
}
