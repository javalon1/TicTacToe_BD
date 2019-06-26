package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondWindow {

    private JFrame frame2;
    private JTextField field2;
    private JButton button2;
    private JoinListener listener;

    public SecondWindow() {
        frame2 = new JFrame("WindowsSecond");
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(300, 250);

   /*     frame2 = new JFrame("WindowsSecond");
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(300,250);*/

        field2 = new JTextField();
        field2.setBounds(50, 50, 200, 50);
        frame2.add(field2);

        button2 = new JButton("Connect");
        button2.setBounds(50, 150, 200, 50);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleJoinClicked();
            }
        });

        frame2.add(button2);
    }

    private void handleJoinClicked() {
        if (listener != null) {
            listener.joinClicked(field2.getText());
        } else {
            System.out.println("No one listen me!");
        }
    }

    public void show() {
        frame2.setVisible(true);
    }

    public void setListener(JoinListener listener) {
        this.listener = listener;
    }
}
