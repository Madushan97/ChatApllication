package com.company.server;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Chat_Server {
    private JButton button1;
    private JPanel panel1;
    private JButton sendButton;
    private JTextArea Message_area;

    public Chat_Server() {
        button1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
            }
        });
    }
}
