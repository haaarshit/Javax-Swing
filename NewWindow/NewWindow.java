package NewWindow;

import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    NewWindow(){
        label.setBounds(0,0,100,50);
        label.setText("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720,560);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
