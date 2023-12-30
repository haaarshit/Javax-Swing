package NewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    LaunchPage(){
        button.setBounds(100,160,100,40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
    }
    public  void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
//            frame.dispose(); // will close the launch page
            NewWindow myWindow = new NewWindow(); // launch new frame page
        }
    }
}
