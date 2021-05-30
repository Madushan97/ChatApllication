package com.company.server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Chat_Server extends JFrame{
    private JButton button1;
    private JPanel panel1;
    private JButton sendButton;
    private JTextArea Message_area;

    public Chat_Server() {
        button1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
//              this uses the form designer form
                add(Message_area);
                setTitle("This is my Server");
                setSize(400, 500);
            }
        });
//        start button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Message_area, "Server is started...");
            }
        });
//        send button
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Message_area, "SMessage sent...");
            }
        });
    }
    public void setVisible(boolean b) {
    }
}
