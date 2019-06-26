package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App
{
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private int clickCount=0;

    public App()
    {
        frame = new JFrame("Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,250);

        label = new JLabel("0");
        label.setBounds(50,50,200,50);
        frame.add(label);

        button = new JButton("More!");
        button.setBounds(50,150,200,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                label.setText(String.valueOf(clickCount));
            }
        });
        frame.add(button);
    }

    public void show()
    {
        frame.setVisible(true);
    }


}
