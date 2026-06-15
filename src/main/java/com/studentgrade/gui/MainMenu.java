package com.studentgrade.gui;
import javax.swing.*; // Import all Swing Components
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends JFrame {
    public static void main (String[] args){
        // Create a Window Container
        JFrame frame = new JFrame ("Academic Perfomance Tracker");
        frame.setSize ( 300,300 );
        frame.setLocationRelativeTo ( null );
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        // use a Layout manager so component do not overlap
        frame.setLayout ( new FlowLayout (  ) );
        // Create a Button Component
        JPanel panel = new JPanel (new FlowLayout (  ));

        // Create leaf Components
        JLabel titleLabel = new JLabel ( "Welcome to Tracker" );
        JButton button1 = new JButton ("Grade Tracker");
        JButton button2 = new JButton ("GPA Tracker");


        button1.addActionListener ( new ActionListener ( ) {
            @Override
            public void actionPerformed ( ActionEvent e ) {
                new GradeTrackerFrame();
            }
        } );

        button2.addActionListener ( new ActionListener ( ) {
            @Override
            public void actionPerformed ( ActionEvent e ) {
                new GPATrackerFrame ();
            }
        } );





        // Add Leaf Component into the Panel
        panel.add(titleLabel);
        panel.add ( button1 );
        panel.add ( button2 );



        // Add the populated Jpanel into the JFrame
        frame.add ( panel );

        // Display the window
        frame.setVisible ( true );
    }
}