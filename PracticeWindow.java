/*
 * Name: Jesse Thomas
 * COMP 350
 * Lab01
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PracticeWindow extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    public final void buttonAdd()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.blue);
        JButton aButton = new JButton("A button.");
        aButton.setBackground(Color.green);
        aButton.setBounds(70,80,100,50);
        panel.add(aButton);
        
           
    }

    public PracticeWindow(Color theColor)
    {
        super("Colors~" );
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonAdd();
    }

    public PracticeWindow( )
    {
        this(Color.BLUE);
    }
}
