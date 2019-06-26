package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow {
    private JFrame frame1;
    private JTextField field1;
    private JButton button1;
    private JoinListener listener;

    public FirstWindow() {
        frame1 = new JFrame("WindowsFirst");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(300, 250);

   /*     frame2 = new JFrame("WindowsSecond");
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(300,250);*/

        field1 = new JTextField();
        field1.setBounds(50, 50, 200, 50);
        frame1.add(field1);

        button1 = new JButton("Connect");
        button1.setBounds(50, 150, 200, 50);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleJoinClicked();
            }
        });

        frame1.add(button1);
    }

    private void handleJoinClicked() {
        if (listener != null) {
            listener.joinClicked(field1.getText());
        } else {
            System.out.println("No one listen me!");
        }
    }

    public void show() {
        frame1.setVisible(true);
    }

    public void setListener(JoinListener listener) {
        this.listener = listener;
    }
}
