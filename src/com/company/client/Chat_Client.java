package com.company.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Chat_Client extends  JFrame{
    private JButton Message_area;
    private JButton startButton;
    private JTextArea rootPanel;
    public Chat_Client() {
        startButton.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
//              this uses the form designer form
                add(rootPanel);
                setTitle("This is my Client");
                setSize(400, 500);

                setDefaultCloseOperation(Chat_Client.DISPOSE_ON_CLOSE);
            }
        });
        //start button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Client Started...");
            }
        });
//        send button
        Message_area.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Message Sent...");
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
