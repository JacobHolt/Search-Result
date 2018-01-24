package Java;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main {

    private static GUI gui;

    public static void main(String[] args){

        JFrame window = new JFrame("Search Result");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui = new GUI();
        window.add(gui);
        window.setSize(600,700);
        window.setVisible(true);

    }
}
