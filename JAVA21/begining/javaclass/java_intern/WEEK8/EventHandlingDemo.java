package javaclass.java_intern.WEEK8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventHandlingDemo extends JFrame implements ActionListener,MouseListener,KeyListener,WindowListener {
    private JLabel statusLabel;
    setTitle("Event handling Demo");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    statusLabel = new JLabel("Status: ");
    add(statusLabel,BorderLayout.SOUTH);
    addMouseListener(this);
    addKeyListener(this);
    addWindowListener(this);
    setFocusable(true);

}
