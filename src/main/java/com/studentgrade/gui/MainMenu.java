package com.studentgrade.gui;
import javax.swing.*; // Import all Swing Components

public class MainMenu {
    public static void main (String[] args){
        // Create a Window Container
        JFrame frame = new JFrame ("Academic Perfomance Tracker");
        frame.setSize ( 300,300 );
        frame.setLocationRelativeTo ( null );
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        // Create a Button Component

        JButton button = new JButton ("Click Me");
        frame.add(button);

        // Display the window
        frame.setVisible ( true );
    }
}