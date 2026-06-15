package com.studentgrade.gui;

import javax.swing.*;
import java.awt.*;

public class GradeTrackerFrame extends JFrame {

    JTextField studentNameField;
    JTextField courseNameField;
    JSpinner marksSpinner;
    JButton addButton;
    JTable studentTable;

    public GradeTrackerFrame () {
        setTitle ( "Grade Tracker" );
        setSize ( 400 , 300 );
        setLocationRelativeTo ( null );
        setVisible ( true );

        // Main layout
        setLayout ( new BorderLayout ( ) );

        // North Pannel
        JPanel inputPanel = new JPanel ( );

        studentNameField = new JTextField ( 10 );
        courseNameField = new JTextField ( 10 );
        marksSpinner = new JSpinner (
                new SpinnerNumberModel ( 0 , 0 , 100 , 1 ) );
        addButton = new JButton ( "Add" );

        inputPanel.add ( new JLabel ( "Student" ) );
        inputPanel.add ( studentNameField );

        inputPanel.add ( new JLabel ( "Course" ) );
        inputPanel.add ( courseNameField );

        inputPanel.add ( new JLabel ( "Marks" ) );
        inputPanel.add ( marksSpinner );

        inputPanel.add ( addButton );
        add ( inputPanel , BorderLayout.NORTH );

        // center Pannel

        String[] columns = {"Student" , "Course" , "Marks" , "Grade"};
        studentTable = new JTable ( new Object[][]{} , columns );

        add ( new JScrollPane ( studentTable ) , BorderLayout.CENTER );

        // South Pannel

        JPanel statisicsPanel = new JPanel ( );
        statisicsPanel.add ( new JLabel ( "Average: 0" ) );
        statisicsPanel.add ( new JLabel ( "Highest: 0" ) );
        statisicsPanel.add ( new JLabel ( "Lowest: 0" ) );

        add ( statisicsPanel , BorderLayout.SOUTH );
        setVisible ( true );
    }
}









